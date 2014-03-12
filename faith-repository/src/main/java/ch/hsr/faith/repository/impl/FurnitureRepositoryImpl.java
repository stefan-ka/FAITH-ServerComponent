package ch.hsr.faith.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Furniture;
import ch.hsr.faith.repository.FurnitureRepository;

@Repository
public class FurnitureRepositoryImpl implements FurnitureRepository {

	@Override
	public List<Furniture> findAll() {
		// TODO Has to be implemented correctly.
		// Just add some mock data for tests:
		List<Furniture> furnitureList = new ArrayList<>();

		Furniture furniture1 = new Furniture();
		furniture1.setId(new Long(1));
		furniture1.setName("Bett");

		Furniture furniture2 = new Furniture();
		furniture2.setId(new Long(2));
		furniture2.setName("Sofa");

		furnitureList.add(furniture1);
		furnitureList.add(furniture2);

		return furnitureList;
	}

}
