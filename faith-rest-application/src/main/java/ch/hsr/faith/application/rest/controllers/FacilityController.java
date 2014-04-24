package ch.hsr.faith.application.rest.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;
import ch.hsr.faith.application.rest.validator.FacilityValidator;
import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.FacilityCategory;
import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.exception.FAITHException;
import ch.hsr.faith.service.FacilityCategoryService;
import ch.hsr.faith.service.FacilityService;
import ch.hsr.faith.service.UserAccountService;

@Controller
@RequestMapping("/facilities")
public class FacilityController extends AbstractController {

	@Autowired
	private FacilityService facilityService;
	
	@Autowired
	private UserAccountService userAccountService;

	@Autowired
	private FacilityCategoryService facilityCategoryService;

	@Autowired
	private FacilityValidator facilityValidator;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse getAllOrganizations(Model model) {
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, this.facilityService.findAll());
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public BaseJSONResponse addFacility(Model model, @Valid @RequestBody Facility facility) {
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, this.facilityService.add(facility));
	}

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse getFirstOrganization(Model model) {
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, this.facilityService.get(1l));
	}

	@RequestMapping(value = "/findByCategoryId/{categoryId}", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse getCategoryId(@PathVariable long categoryId) throws FAITHException {
		FacilityCategory facilityCategory = facilityCategoryService.findById(categoryId);
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, facilityService.findByCategory(facilityCategory));
	}
	
	@RequestMapping(value = "/findByUserAccountId/{userId}", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse getUserAccountId(@PathVariable long userId) throws FAITHException {
		UserAccount userAccount = userAccountService.findById(userId);
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, facilityService.findByUserAccount(userAccount));
	}
}
