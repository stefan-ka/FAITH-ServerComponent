package ch.hsr.faith.repository.mock;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.repository.UserAccountRepository;

@Repository
public class UserAccountMockRepository extends AbstractMockRepository<UserAccount> implements UserAccountRepository {

	@Override
	public UserAccount findByUserName(String userName) {
		if (userName == null)
			return null;
		for (UserAccount userAccount : objectMap.values()) {
			if (userName.equals(userAccount.getUserName())) {
				return userAccount;
			}
		}
		return null;
	}

}
