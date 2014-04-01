package ch.hsr.faith.application.rest.controllers;

import java.util.List;

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

@Controller
@RequestMapping("/furniture-categories")
public class FurnitureCategoryController extends AbstractController {

	@Autowired
	private FurnitureCategoryService furnitureCategoryService;

	@RequestMapping(value = "/all-roots", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse getAllFurnitures(Model model) {
		List<FurnitureCategory> furnitureCategoryList = this.furnitureCategoryService.findRootCategories();
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, furnitureCategoryList);
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse editSmartphonePage(@PathVariable long id) throws FAITHException {
		FurnitureCategory furnitureCategory = this.furnitureCategoryService.findById(id);
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, furnitureCategory);
	}

}
