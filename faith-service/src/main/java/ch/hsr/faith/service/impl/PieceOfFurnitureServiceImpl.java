package ch.hsr.faith.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.domain.PieceOfFurniture;
import ch.hsr.faith.repository.PieceOfFurnitureRepository;
import ch.hsr.faith.service.PieceOfFurnitureService;

@Service
public class PieceOfFurnitureServiceImpl implements PieceOfFurnitureService {

	@Autowired
	private PieceOfFurnitureRepository pieceOfFurnitureRepository;

	@Override
	public List<PieceOfFurniture> findAll() {
		return this.pieceOfFurnitureRepository.findAll();
	}

	@Override
	public PieceOfFurniture create(PieceOfFurniture item) {
		return pieceOfFurnitureRepository.save(item);
	}

	@Override
	public List<PieceOfFurniture> findByCategory(FurnitureCategory furnitureCategory) {
		return pieceOfFurnitureRepository.findByCategory(furnitureCategory);
	}

}
