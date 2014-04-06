package ch.hsr.faith.application.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;
import ch.hsr.faith.service.PieceOfFurnitureService;

@Controller
@RequestMapping("/piece-of-furnitures")
public class PieceOfFurnitureController extends AbstractController {

	@Autowired
	private PieceOfFurnitureService pieceOfFurnitureService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse getAllFurnitures(Model model) {
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, this.pieceOfFurnitureService.findAll());
	}

}
