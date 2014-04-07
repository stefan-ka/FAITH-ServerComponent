package ch.hsr.faith.application.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse showProduct(Model model) {
		BaseJSONResponse message = new BaseJSONResponse(BaseJSONResponse.STATUS_SUCCESS);
		message.setData("Welcome to the FAITH Rest Services!");
		return message;
	}

	@RequestMapping(value = "/secured", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse showSecuredMethod(Model model) {
		BaseJSONResponse message = new BaseJSONResponse(BaseJSONResponse.STATUS_SUCCESS);
		message.setData(userAccountService.secureMehtod());
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
