package ch.hsr.faith.repository;

import java.util.List;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.domain.PieceOfFurniture;

public interface PieceOfFurnitureRepository {

	public PieceOfFurniture save(PieceOfFurniture item);

	public void delete(PieceOfFurniture item);

	public PieceOfFurniture findById(Long id);

	public List<PieceOfFurniture> findAll();

	public List<PieceOfFurniture> findByCategory(FurnitureCategory furnitureCategory);

}
