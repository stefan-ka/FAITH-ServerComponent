package ch.hsr.faith.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Furniture;
import ch.hsr.faith.repository.FurnitureRepository;
import ch.hsr.faith.repository.impl.jpa.JpaFurnitureRepository;

@Repository
public class FurnitureRepositoryImpl implements FurnitureRepository {

	@Autowired
	private JpaFurnitureRepository jpaFurnitureRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Furniture save(Furniture item) {
		return jpaFurnitureRepository.saveAndFlush(item);
	}

	@Override
	public void delete(Furniture item) {
		jpaFurnitureRepository.delete(item);
		jpaFurnitureRepository.flush();
	}

	@Override
	public Furniture findById(Long id) {
		return jpaFurnitureRepository.findOne(id);
	}

	@Override
	public List<Furniture> findAll() {
		return jpaFurnitureRepository.findAll();
	}

}
