package ch.hsr.faith.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.domain.PieceOfFurniture;
import ch.hsr.faith.repository.PieceOfFurnitureRepository;
import ch.hsr.faith.repository.impl.jpa.JpaPieceOfFurnitureRepository;

@Repository
public class PieceOfFurnitureRepositoryImpl implements PieceOfFurnitureRepository {

	@Autowired
	private JpaPieceOfFurnitureRepository jpaPieceOfFurnitureRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PieceOfFurniture save(PieceOfFurniture item) {
		return jpaPieceOfFurnitureRepository.saveAndFlush(item);
	}

	@Override
	public void delete(PieceOfFurniture item) {
		jpaPieceOfFurnitureRepository.delete(item);
		jpaPieceOfFurnitureRepository.flush();
	}

	@Override
	public PieceOfFurniture findById(Long id) {
		return jpaPieceOfFurnitureRepository.findOne(id);
	}

	@Override
	public List<PieceOfFurniture> findAll() {
		return jpaPieceOfFurnitureRepository.findAll();
	}

	@Override
	public List<PieceOfFurniture> findByCategory(FurnitureCategory furnitureCategory) {
		return jpaPieceOfFurnitureRepository.findByFurnitureCategory(furnitureCategory);
	}

}
