package ch.hsr.faith.repository.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.repository.FurnitureCategoryRepository;

@Repository
public class FurnitureCategoryMockRepository extends AbstractMockRepository<FurnitureCategory> implements FurnitureCategoryRepository {

	@Override
	public List<FurnitureCategory> findByParentCategory(FurnitureCategory parentCategory) {
		if (parentCategory == null)
			return findAll();
		List<FurnitureCategory> childCategories = new ArrayList<>();
		for (FurnitureCategory furnitureCategory : findAll()) {
			if (furnitureCategory.getParent() != null && furnitureCategory.getParent().getId().equals(parentCategory.getId())) {
				childCategories.add(furnitureCategory);
			}
		}
		return childCategories;
	}

}
