package ch.hsr.faith.application.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;
import ch.hsr.faith.service.FacilityCategoryService;

@Controller
@RequestMapping("/facility-categories")
public class FacilityCategoryController extends AbstractController {

	@Autowired
	private FacilityCategoryService facilityCategoryService;

	@RequestMapping(value = "/find-all", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse findAllFacilityCategories(Model model) {
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, this.facilityCategoryService.findAll());
	}
}
