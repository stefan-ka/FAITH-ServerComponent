package ch.hsr.faith.repository;

import java.util.List;

import ch.hsr.faith.domain.Organization;


public interface OrganizationRepository {
	
	public Organization save(Organization item);

	public void delete(Organization item);

	public Organization findById(Long id);

	public List<Organization> findAll();

}
