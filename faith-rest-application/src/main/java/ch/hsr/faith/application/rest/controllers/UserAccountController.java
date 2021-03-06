package ch.hsr.faith.application.rest.controllers;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;
import ch.hsr.faith.application.rest.validator.UserAccountValidator;
import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.exception.FAITHException;
import ch.hsr.faith.service.UserAccountService;

@Controller
@RequestMapping("/useraccount")
public class UserAccountController extends AbstractController {

	@Autowired
	private UserAccountService userAccountService;

	@Autowired
	private UserAccountValidator userAccountValidator;

	Logger logger = Logger.getRootLogger();

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(userAccountValidator);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public BaseJSONResponse registerUserAccount(Model model, @Valid @RequestBody UserAccount userAccount) throws FAITHException {
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, this.userAccountService.save(userAccount));
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public BaseJSONResponse loginUserAccount(Model model) throws FAITHException {
		UserAccount userAccount = getLoggedInUser();
		if (userAccount != null) {
			logger.info("User '" + userAccount.getEmail() + "' successfully logged in.");
		}
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, "Client successfully logged in");
	}
}
