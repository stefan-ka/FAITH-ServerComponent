package ch.hsr.faith.repository;

import java.util.List;

import ch.hsr.faith.domain.Furniture;

public interface FurnitureRepository {

	public Furniture save(Furniture item);

	public void delete(Furniture item);

	public Furniture findById(Long id);

	public List<Furniture> findAll();

}
