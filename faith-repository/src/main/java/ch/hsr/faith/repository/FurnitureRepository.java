package ch.hsr.faith.repository;

import java.util.List;

import ch.hsr.faith.domain.Furniture;

public interface FurnitureRepository {

	public List<Furniture> findAll();
	
}
