package ch.hsr.faith.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.repository.FurnitureCategoryRepository;
import ch.hsr.faith.repository.impl.jpa.JpaFurnitureCategoryRepository;

@Repository
public class FurnitureCategoryRepositoryImpl implements FurnitureCategoryRepository {

	@Autowired
	private JpaFurnitureCategoryRepository jpaFurnitureCategoryRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public FurnitureCategory save(FurnitureCategory item) {
		return jpaFurnitureCategoryRepository.saveAndFlush(item);
	}

	@Override
	public void delete(FurnitureCategory item) {
		jpaFurnitureCategoryRepository.delete(item);
		jpaFurnitureCategoryRepository.flush();
	}

	@Override
	public FurnitureCategory findById(Long id) {
		return jpaFurnitureCategoryRepository.findOne(id);
	}

	@Override
	public List<FurnitureCategory> findAll() {
		return jpaFurnitureCategoryRepository.findAll();
	}

	@Override
	public List<FurnitureCategory> findByParentCategory(FurnitureCategory parentCategory) {
		return jpaFurnitureCategoryRepository.findByParent(parentCategory);
	}

}
