package ch.hsr.faith.application.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;
import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.exception.FAITHException;
import ch.hsr.faith.service.UserAccountService;

public abstract class AbstractController {

	@Autowired
	private UserAccountService userAccountService;

	protected BaseJSONResponse createResponse(String status, Object data) {
		BaseJSONResponse response = new BaseJSONResponse(status);
		response.setData(data);
		return response;
	}

	protected UserAccount getLoggedInUser() throws FAITHException {
		UserAccount user = null;
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			user = this.userAccountService.findByEmail(auth.getName());
		}
		return user;
	}

}
