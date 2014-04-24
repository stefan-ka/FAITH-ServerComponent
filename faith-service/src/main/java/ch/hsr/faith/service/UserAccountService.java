package ch.hsr.faith.service;

import org.springframework.security.access.annotation.Secured;

import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.exception.FAITHException;

public interface UserAccountService {

	public UserAccount save(UserAccount userAccount) throws FAITHException;

	public boolean doesEmailAlreadyExist(String email);
	
	public UserAccount findById(Long id) throws FAITHException;

	@Secured("ROLE_USER")
	public String secureMethod();
	
	public String nonSecureMethod();
}
