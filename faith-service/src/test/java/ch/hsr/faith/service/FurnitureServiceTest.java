package ch.hsr.faith.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.Furniture;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/service-test-context.xml" })
public class FurnitureServiceTest {
	@Autowired
	private FurnitureService furnitureService;

	Furniture furniture1, furniture2;

	@Before
	public void setUp() {
		furniture1 = new Furniture();
		furniture1.setName("F1");
		furniture1 = furnitureService.create(furniture1);
		furniture2 = new Furniture();
		furniture2.setName("F2");
		furniture2 = furnitureService.create(furniture2);

	}

	@Test
	public void furnitureFindAllTest() {
		List<Furniture> allFoundFurnitures = furnitureService.findAll();
		assertEquals(2, allFoundFurnitures.size());
	}
	
}
