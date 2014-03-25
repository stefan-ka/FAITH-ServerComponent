package ch.hsr.faith.application.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.hsr.faith.domain.Organization;
import ch.hsr.faith.service.OrganizationService;

@Controller
@RequestMapping("/organizations")
public class OrganizationController extends AbstractController {

	@Autowired
	private OrganizationService organizationService;

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Organization> getAllOrganizations(Model model) {
		return this.organizationService.findAll();
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public Organization addOrganisatzion(Model model, @RequestBody Organization organization) {
		return organizationService.add(organization);
	}

	@RequestMapping(value = "/first", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Organization getFirstOrganization(Model model) {
		return this.organizationService.get(1l);
	}
}
