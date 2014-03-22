package ch.hsr.faith.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hsr.faith.domain.Organization;
import ch.hsr.faith.repository.OrganizationRepository;
import ch.hsr.faith.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private OrganizationRepository organizationRepository;
	
	@Override
	public List<Organization> findAll() {
		return organizationRepository.findAll();
	}

}
