package ch.hsr.faith.repository;

import java.util.List;

import ch.hsr.faith.domain.FurnitureCategory;

public interface FurnitureCategoryRepository {

	public FurnitureCategory save(FurnitureCategory item);

	public void delete(FurnitureCategory item);

	public FurnitureCategory findById(Long id);

	public List<FurnitureCategory> findAll();

	public List<FurnitureCategory> findByParentCategory(FurnitureCategory parentCategory);

}
