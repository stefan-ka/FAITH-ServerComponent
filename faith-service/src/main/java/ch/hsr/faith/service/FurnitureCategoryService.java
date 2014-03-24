package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.FurnitureCategory;

public interface FurnitureCategoryService {

	public List<FurnitureCategory> findRootCategories();

}
