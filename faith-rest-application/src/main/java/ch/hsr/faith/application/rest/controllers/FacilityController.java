package ch.hsr.faith.application.rest.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;
import ch.hsr.faith.application.rest.validator.FacilityValidator;
import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.service.FacilityService;

@Controller
@RequestMapping("/facilities")
public class FacilityController extends AbstractController {

	@Autowired
	private FacilityService facilityService;

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
}
