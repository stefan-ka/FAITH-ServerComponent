package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.Furniture;

public interface FurnitureService {

	public List<Furniture> findAll();
	
	public Furniture create(Furniture item);

}
