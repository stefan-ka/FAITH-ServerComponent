package ch.hsr.faith.application.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;
import ch.hsr.faith.domain.Organization;
import ch.hsr.faith.service.OrganizationService;

@Controller
@RequestMapping("/organizations")
public class OrganizationController extends AbstractController {

	@Autowired
	private OrganizationService organizationService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse getAllOrganizations(Model model) {
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, this.organizationService.findAll());
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public BaseJSONResponse addOrganisatzion(Model model, @RequestBody Organization organization) {
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, organizationService.add(organization));
	}

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	@ResponseBody
	public BaseJSONResponse getFirstOrganization(Model model) {
		return createResponse(BaseJSONResponse.STATUS_SUCCESS, this.organizationService.get(1l));
	}
}
