package ch.hsr.faith.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hsr.faith.domain.Furniture;
import ch.hsr.faith.repository.FurnitureRepository;
import ch.hsr.faith.service.FurnitureService;

@Service
public class FurnitureServiceImpl implements FurnitureService {

	@Autowired
	private FurnitureRepository furnitureRepository;

	@Override
	public List<Furniture> findAll() {
		return this.furnitureRepository.findAll();
	}

}
