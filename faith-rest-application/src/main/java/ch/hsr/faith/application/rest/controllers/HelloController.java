package ch.hsr.faith.application.rest.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;
import ch.hsr.faith.service.UserAccountService;

@Controller
@RequestMapping("/")
public class HelloController extends AbstractController {

	@Autowired
	private UserAccountService userAccountService;

	Logger logger = Logger.getRootLogger();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse showProduct(Model model) {
		BaseJSONResponse message = new BaseJSONResponse(BaseJSONResponse.STATUS_SUCCESS);
		message.setData("Welcome to the FAITH Rest Services!");
		logger.info("FAITH Hello Controller was called...");
		return message;
	}

	@RequestMapping(value = "/mu-a8bdc266-28765094-58641ee2-a510e9ca", method = RequestMethod.GET)
	@ResponseBody
	public String authorizeBlitz() {
		return "42";
	}

	@RequestMapping(value = "/secured", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse showSecuredMethod(Model model) {
		BaseJSONResponse message = new BaseJSONResponse(BaseJSONResponse.STATUS_SUCCESS);
		message.setData(userAccountService.secureMethod());
		return message;
	}

	@RequestMapping(value = "/nonsecured", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse showNonSecuredMethod(Model model) {
		BaseJSONResponse message = new BaseJSONResponse(BaseJSONResponse.STATUS_SUCCESS);
		message.setData(userAccountService.nonSecureMethod());
		return message;
	}
}
