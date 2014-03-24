package ch.hsr.faith.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.repository.FurnitureCategoryRepository;
import ch.hsr.faith.service.FurnitureCategoryService;

@Service
public class FurnitureCategoryServiceImpl implements FurnitureCategoryService {

	@Autowired
	private FurnitureCategoryRepository furnitureCategoryRepository;

	@Override
	public List<FurnitureCategory> findRootCategories() {
		return furnitureCategoryRepository.findByParentCategory(null);
	}

}
