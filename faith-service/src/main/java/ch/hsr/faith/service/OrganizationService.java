package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.Organization;

public interface OrganizationService {

	public List<Organization> findAll();
	
	public Organization add(Organization item);
	
	public Organization get(Long id);

}
