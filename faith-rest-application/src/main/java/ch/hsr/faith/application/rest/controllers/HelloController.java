package ch.hsr.faith.application.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;

@Controller
@RequestMapping("/")
public class HelloController extends AbstractController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse showProduct(Model model) {
		BaseJSONResponse message = new BaseJSONResponse(BaseJSONResponse.STATUS_SUCCESS);
		message.setData("Welcome to the FAITH Rest Services!");
		return message;
	}
}
