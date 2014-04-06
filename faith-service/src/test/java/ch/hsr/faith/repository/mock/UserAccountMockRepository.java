package ch.hsr.faith.repository.mock;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.repository.UserAccountRepository;

@Repository
public class UserAccountMockRepository extends AbstractMockRepository<UserAccount> implements UserAccountRepository {

	@Override
	public UserAccount findByEmail(String email) {
		if (email == null)
			return null;
		for (UserAccount userAccount : objectMap.values()) {
			if (email.equals(userAccount.getEmail())) {
				return userAccount;
			}
		}
		return null;
	}

}
