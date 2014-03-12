package ch.hsr.faith.application.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController extends AbstractController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showProduct(Model model) {
		WelcomeMessage message = new WelcomeMessage();
		message.setMessage("Welcome to the FAITH Rest Services!");

		return new ModelAndView(jsonView, DATA_FIELD, message);
	}

	private class WelcomeMessage {
		private String message;

		@SuppressWarnings("unused")
		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

}
