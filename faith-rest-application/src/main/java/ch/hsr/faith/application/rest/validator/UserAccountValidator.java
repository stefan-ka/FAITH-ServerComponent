package ch.hsr.faith.application.rest.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.service.UserAccountService;

@Component
public class UserAccountValidator implements Validator {

	@Autowired
	private UserAccountService userAccountService;

	@Override
	public boolean supports(Class<?> clazz) {
		return UserAccount.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		if (object instanceof UserAccount) {
			UserAccount userAccount = (UserAccount) object;
			if (userAccount.getEmail() == null || "".equals(userAccount.getEmail())) {
				errors.rejectValue("email", "emptyField.useraccount.email");
			}
			if (userAccount.getPassword() == null || "".equals(userAccount.getPassword())) {
				errors.rejectValue("password", "emptyField.useraccount.password");
			}
			if (userAccountService.doesEmailAlreadyExist(userAccount.getEmail())) {
				errors.rejectValue("userName", "notunique.useraccount.email");
			}
		}
	}

}
