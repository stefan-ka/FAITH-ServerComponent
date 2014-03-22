package ch.hsr.faith.application.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ch.hsr.faith.domain.Organization;
import ch.hsr.faith.service.OrganizationService;

@Controller
@RequestMapping("/organizations")
public class OrganizationController extends AbstractController {

	@Autowired
	private OrganizationService organizationService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ModelAndView getAllOrganizations(Model model) {
		List<Organization> organizationList = this.organizationService.findAll();
		return new ModelAndView(jsonView, DATA_FIELD, organizationList);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
	public ModelAndView addOrganisatzion(Model model, @RequestBody Organization organization) {
		organization = organizationService.add(organization);
		return new ModelAndView(jsonView, DATA_FIELD, organization);
	}
	
	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public ModelAndView getFirstOrganization(Model model) {
		Organization organization = this.organizationService.get(1l);
		return new ModelAndView(jsonView, DATA_FIELD, organization);
	}
}
