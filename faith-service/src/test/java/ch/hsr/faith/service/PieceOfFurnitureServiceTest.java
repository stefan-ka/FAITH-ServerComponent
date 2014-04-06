package ch.hsr.faith.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.PieceOfFurniture;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/service-test-context.xml" })
public class PieceOfFurnitureServiceTest {
	@Autowired
	private PieceOfFurnitureService pieceOfFurnitureService;

	PieceOfFurniture furniture1, furniture2;

	@Before
	public void setUp() {
		furniture1 = new PieceOfFurniture();
		furniture1.setName("F1");
		furniture1 = pieceOfFurnitureService.create(furniture1);
		furniture2 = new PieceOfFurniture();
		furniture2.setName("F2");
		furniture2 = pieceOfFurnitureService.create(furniture2);

	}

	@Test
	public void furnitureFindAllTest() {
		List<PieceOfFurniture> allFoundFurnitures = pieceOfFurnitureService.findAll();
		assertEquals(2, allFoundFurnitures.size());
	}

}
