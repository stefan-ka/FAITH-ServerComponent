package ch.hsr.faith.repository;

import ch.hsr.faith.domain.UserAccount;

public interface UserAccountRepository {

	public UserAccount save(UserAccount item);

	public void delete(UserAccount item);

	public UserAccount findById(Long id);

	public UserAccount findByEmail(String email);

}
