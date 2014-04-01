package ch.hsr.faith.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.FurnitureCategory;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/repository-test-context.xml" })
public class FurnitureCategoryRepositoryTest {

	@Autowired
	private FurnitureCategoryRepository furnitureCategoryRepository;
	
	@Test
	public void testSave(){
		FurnitureCategory validFurnitureCategory = new FurnitureCategory();
		validFurnitureCategory.setName("TestCategorySave");
		FurnitureCategory savedFurnitureCategory = furnitureCategoryRepository.save(validFurnitureCategory);
		assertEquals(savedFurnitureCategory, validFurnitureCategory);
	}
	
	@Test
	public void testDelete() {
		FurnitureCategory validFurnitureCategory = new FurnitureCategory();
		validFurnitureCategory.setName("TestCategoryDelete");
		FurnitureCategory savedFurnitureCategory = furnitureCategoryRepository.save(validFurnitureCategory);
		furnitureCategoryRepository.delete(savedFurnitureCategory);
		assertNull(furnitureCategoryRepository.findById(savedFurnitureCategory.getId()));
	}
	
	@Test
	public void testFindById() {
		FurnitureCategory validFurnitureCategory = new FurnitureCategory();
		validFurnitureCategory.setName("TestCategoryFindById");
		FurnitureCategory savedFurnitureCategory = furnitureCategoryRepository.save(validFurnitureCategory);
		assertEquals(savedFurnitureCategory, furnitureCategoryRepository.findById(savedFurnitureCategory.getId()));
	}
	
	@Test
	public void testFindAll() {
		FurnitureCategory validFurnitureCategoryN0 = new FurnitureCategory();
		validFurnitureCategoryN0.setName("TestCategoryFindAllN0");
		FurnitureCategory validFurnitureCategoryN1 = new FurnitureCategory();
		validFurnitureCategoryN1.setName("TestCategoryFindAllN1");
		furnitureCategoryRepository.save(validFurnitureCategoryN0);
		furnitureCategoryRepository.save(validFurnitureCategoryN1);
		assertEquals(2, furnitureCategoryRepository.findAll().size());		
	}
	
	@Test
	public void testFindByParentCategory() {
		FurnitureCategory validFurnitureCategoryParent = new FurnitureCategory();
		validFurnitureCategoryParent.setName("TestCategoryParent");
		FurnitureCategory validFurnitureCategoryChild = new FurnitureCategory();
		validFurnitureCategoryChild.setName("TestCategoryChild");
		validFurnitureCategoryChild.setParent(validFurnitureCategoryParent);
		FurnitureCategory storedFurnitureCategoryParent = furnitureCategoryRepository.save(validFurnitureCategoryParent);
		FurnitureCategory storedFurnitureCategoryChild = furnitureCategoryRepository.save(validFurnitureCategoryChild);
		
		List<FurnitureCategory> foundChilds = furnitureCategoryRepository.findByParentCategory(storedFurnitureCategoryParent);
		assertEquals(storedFurnitureCategoryChild, foundChilds.get(0));
	}
	
	
}