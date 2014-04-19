package ch.hsr.faith.application.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;
import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.exception.FAITHException;
import ch.hsr.faith.service.FurnitureCategoryService;
import ch.hsr.faith.service.PieceOfFurnitureService;

@Controller
@RequestMapping("/piece-of-furnitures")
public class PieceOfFurnitureController extends AbstractController {

	@Autowired
	private PieceOfFurnitureService pieceOfFurnitureService;

	@Autowired
	private FurnitureCategoryService furnitureCategoryService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse getAllFurnitures(Model model) {
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, this.pieceOfFurnitureService.findAll());
	}

	@RequestMapping(value = "/findByCategoryId/{categoryId}", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse getCategoryId(@PathVariable long categoryId) throws FAITHException {
		FurnitureCategory furnitureCategory = furnitureCategoryService.findById(categoryId);
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, pieceOfFurnitureService.findByCategory(furnitureCategory));
	}

}
