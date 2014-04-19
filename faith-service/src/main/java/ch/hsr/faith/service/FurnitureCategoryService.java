package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.exception.FAITHException;

public interface FurnitureCategoryService {

	public List<FurnitureCategory> findRootCategories();

	public List<FurnitureCategory> findByParent(FurnitureCategory parentCategory);

	public FurnitureCategory findById(Long id) throws FAITHException;

	public FurnitureCategory create(FurnitureCategory item);

}
