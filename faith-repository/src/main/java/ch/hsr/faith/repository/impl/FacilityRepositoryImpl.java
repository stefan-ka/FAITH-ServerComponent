package ch.hsr.faith.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.repository.FacilityRepository;
import ch.hsr.faith.repository.impl.jpa.JpaFacilityRepository;

@Repository
public class FacilityRepositoryImpl implements FacilityRepository {

	@Autowired
	private JpaFacilityRepository jpaFacilityRepository;

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Facility save(Facility item) {
		return jpaFacilityRepository.saveAndFlush(item);
	}

	@Override
	public void delete(Facility item) {
		jpaFacilityRepository.delete(item);
		jpaFacilityRepository.flush();
	}

	@Override
	public Facility findById(Long id) {
		return jpaFacilityRepository.findOne(id);
	}

	@Override
	public List<Facility> findAll() {
		return jpaFacilityRepository.findAll();
	}

}
