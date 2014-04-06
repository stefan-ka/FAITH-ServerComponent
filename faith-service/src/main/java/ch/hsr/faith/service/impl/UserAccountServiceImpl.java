package ch.hsr.faith.service.impl;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.exception.FAITHException;
import ch.hsr.faith.repository.UserAccountRepository;
import ch.hsr.faith.service.UserAccountService;
import ch.hsr.faith.service.util.PasswordEncryptor;

@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	private UserAccountRepository userAccountRepository;

	@Autowired
	private MessageSource messageSource;

	@Override
	public UserAccount save(UserAccount userAccount) throws FAITHException {
		if (userAccount.getPassword() != null && !"".equals(userAccount.getPassword())) {
			try {
				userAccount.setPassword(PasswordEncryptor.encryptPassword(userAccount.getPassword()));
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
				throw new FAITHException(messageSource.getMessage("message.err.password.encryption", null, LocaleContextHolder.getLocale()));
			}

		}
		return userAccountRepository.save(userAccount);
	}

	@Override
	public boolean doesEmailAlreadyExist(String email) {
		UserAccount userAccount = userAccountRepository.findByEmail(email);
		return userAccount != null;
	}

}
