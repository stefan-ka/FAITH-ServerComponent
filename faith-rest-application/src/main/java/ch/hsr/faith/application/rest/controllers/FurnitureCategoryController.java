package ch.hsr.faith.application.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.service.FurnitureCategoryService;

@Controller
@RequestMapping("/furniture-categories")
public class FurnitureCategoryController extends AbstractController {

	@Autowired
	private FurnitureCategoryService furnitureCategoryService;

	@RequestMapping(value = "/all-roots", method = RequestMethod.GET)
	public ModelAndView getAllFurnitures(Model model) {
		List<FurnitureCategory> furnitureCategoryList = this.furnitureCategoryService.findRootCategories();
		return new ModelAndView(jsonView, "furniture-category-list", furnitureCategoryList);
	}

}
