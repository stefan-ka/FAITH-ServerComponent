package ch.hsr.faith.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.exception.FAITHException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/service-test-context.xml" })
public class FurnitureCategoryServiceTest {

	@Autowired
	private FurnitureCategoryService furnitureCategoryService;

	FurnitureCategory furnitureCategoryR1, furnitureCategoryR2;
	long inexistendId = 65537;

	@Before
	public void setUp() {
		furnitureCategoryR1 = new FurnitureCategory();
		furnitureCategoryR1.setName("Root1");
		furnitureCategoryR2 = new FurnitureCategory();
		furnitureCategoryR2.setName("Root2");
		furnitureCategoryR1 = furnitureCategoryService.create(furnitureCategoryR1);
		furnitureCategoryR2 = furnitureCategoryService.create(furnitureCategoryR2);

	}

	@Test
	public void TestFindRootCategories() {
		List<FurnitureCategory> rootCategories = furnitureCategoryService.findRootCategories();
		assertEquals(2, rootCategories.size());
	}

	@Test
	public void TestFindExistingById() throws FAITHException {
		FurnitureCategory foundById = furnitureCategoryService.findById(furnitureCategoryR1.getId());
		assertEquals(furnitureCategoryR1, foundById);
	}

	@Test(expected = FAITHException.class)
	public void TestFindNonExistingById() throws FAITHException {
		furnitureCategoryService.findById(inexistendId);
	}

}
