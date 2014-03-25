package ch.hsr.faith.application.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.domain.Furniture;
import ch.hsr.faith.service.FurnitureService;

@Controller
@RequestMapping("/furnitures")
public class FurnitureController extends AbstractController {

	@Autowired
	private FurnitureService furnitureService;

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Furniture> getAllFurnitures(Model model) {
		return this.furnitureService.findAll();
	}

}
