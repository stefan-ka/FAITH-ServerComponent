package ch.hsr.faith.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Organization;
import ch.hsr.faith.repository.OrganizationRepository;
import ch.hsr.faith.repository.impl.jpa.JpaOrganizationRepository;

@Repository
public class OrganizationRepositoryImpl implements OrganizationRepository {

	@Autowired
	private JpaOrganizationRepository jpaOrganizationRepository;

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Organization save(Organization item) {
		return jpaOrganizationRepository.saveAndFlush(item);
	}

	@Override
	public void delete(Organization item) {
		jpaOrganizationRepository.delete(item);
		jpaOrganizationRepository.flush();
	}

	@Override
	public Organization findById(Long id) {
		return jpaOrganizationRepository.findOne(id);
	}

	@Override
	public List<Organization> findAll() {
		return jpaOrganizationRepository.findAll();
	}

}