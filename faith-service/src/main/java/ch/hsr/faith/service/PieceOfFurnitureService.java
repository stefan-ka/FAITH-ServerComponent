package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.domain.PieceOfFurniture;

public interface PieceOfFurnitureService {

	public List<PieceOfFurniture> findAll();

	public List<PieceOfFurniture> findByCategory(FurnitureCategory furnitureCategory);

	public PieceOfFurniture create(PieceOfFurniture item);

}
