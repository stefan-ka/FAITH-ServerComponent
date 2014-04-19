package ch.hsr.faith.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.exception.FAITHException;
import ch.hsr.faith.repository.FurnitureCategoryRepository;
import ch.hsr.faith.service.FurnitureCategoryService;

@Service
public class FurnitureCategoryServiceImpl implements FurnitureCategoryService {

	@Autowired
	private FurnitureCategoryRepository furnitureCategoryRepository;

	@Autowired
	private MessageSource messageSource;

	@Override
	public List<FurnitureCategory> findRootCategories() {
		return furnitureCategoryRepository.findByParentCategory(null);
	}

	@Override
	public FurnitureCategory findById(Long id) throws FAITHException {
		FurnitureCategory furnitureCategory = furnitureCategoryRepository.findById(id);
		if (furnitureCategory == null)
			throw new FAITHException(messageSource.getMessage("message.id.no.furniturecategory", null, LocaleContextHolder.getLocale()));

		return furnitureCategory;
	}

	@Override
	public FurnitureCategory create(FurnitureCategory item) {
		return furnitureCategoryRepository.save(item);
	}

	@Override
	public List<FurnitureCategory> findByParent(FurnitureCategory parentCategory) {
		return furnitureCategoryRepository.findByParentCategory(parentCategory);
	}

}
