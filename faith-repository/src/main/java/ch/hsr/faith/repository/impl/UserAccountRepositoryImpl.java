package ch.hsr.faith.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.repository.UserAccountRepository;
import ch.hsr.faith.repository.impl.jpa.JpaUserAccountRepository;

@Repository
public class UserAccountRepositoryImpl implements UserAccountRepository {

	@Autowired
	private JpaUserAccountRepository jpaUserAccountRepository;

	@Override
	public UserAccount save(UserAccount item) {
		return jpaUserAccountRepository.saveAndFlush(item);
	}

	@Override
	public void delete(UserAccount item) {
		jpaUserAccountRepository.delete(item);
		jpaUserAccountRepository.flush();
	}

	@Override
	public UserAccount findById(Long id) {
		return jpaUserAccountRepository.findOne(id);
	}

	@Override
	public UserAccount findByUserName(String userName) {
		List<UserAccount> userAccountList = jpaUserAccountRepository.findByUserName(userName);
		if (userAccountList.size() > 0)
			return userAccountList.get(0);
		return null;
	}

}
