package ch.hsr.faith.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.FacilityCategory;
import ch.hsr.faith.repository.FacilityCategoryRepository;
import ch.hsr.faith.repository.impl.jpa.JpaFacilityCategoryRepository;

@Repository
public class FacilityCategoryRepositoryImpl implements FacilityCategoryRepository {

	@Autowired
	private JpaFacilityCategoryRepository jpaFacilityCategoryRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public FacilityCategory save(FacilityCategory item) {
		return jpaFacilityCategoryRepository.saveAndFlush(item);
	}

	@Override
	public void delete(FacilityCategory item) {
		jpaFacilityCategoryRepository.delete(item);
		jpaFacilityCategoryRepository.flush();
	}

	@Override
	public FacilityCategory findById(Long id) {
		return jpaFacilityCategoryRepository.findOne(id);
	}

	@Override
	public List<FacilityCategory> findAll() {
		return jpaFacilityCategoryRepository.findAll();
	}

}
