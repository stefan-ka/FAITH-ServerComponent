package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.PieceOfFurniture;

public interface PieceOfFurnitureService {

	public List<PieceOfFurniture> findAll();
	
	public PieceOfFurniture create(PieceOfFurniture item);

}
