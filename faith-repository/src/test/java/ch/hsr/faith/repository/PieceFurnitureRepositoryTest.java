package ch.hsr.faith.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.FAITHLocale;
import ch.hsr.faith.domain.PieceOfFurniture;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/repository-test-context.xml" })
public class PieceFurnitureRepositoryTest {

	@Autowired
	private PieceOfFurnitureRepository furnitureRepository;

	@Test
	public void testFurnitureCreate() {
		PieceOfFurniture furniture = new PieceOfFurniture();
		furniture.getName().addText(FAITHLocale.GERMAN, "Bett");

		furnitureRepository.save(furniture);
		assertEquals(1, furnitureRepository.findAll().size());
	}

	@Test
	public void testFurnitureRead() {
		PieceOfFurniture furniture = new PieceOfFurniture();
		furniture.getName().addText(FAITHLocale.GERMAN, "MeinBett");

		PieceOfFurniture result = furnitureRepository.save(furniture);
		PieceOfFurniture read = furnitureRepository.findById(result.getId());
		assertEquals(result.getName(), read.getName());
	}

	@Test
	public void testFurnitureUpdate() {
		String furnitureNameInitial = "MeinBett";
		String furnitureNameUpdated = "DeinBett";

		PieceOfFurniture furniture = new PieceOfFurniture();
		furniture.getName().addText(FAITHLocale.GERMAN, furnitureNameInitial);

		PieceOfFurniture result = furnitureRepository.save(furniture);
		result.getName().addText(FAITHLocale.GERMAN, furnitureNameUpdated);
		result = furnitureRepository.save(furniture);
		PieceOfFurniture read = furnitureRepository.findById(result.getId());

		assertEquals(result.getName(), read.getName());
	}

	@Test
	public void testFurnitureDelete() {
		String furnitureNameInitial = "SeinBett";

		PieceOfFurniture furniture = new PieceOfFurniture();
		furniture.getName().addText(FAITHLocale.GERMAN, furnitureNameInitial);

		PieceOfFurniture result = furnitureRepository.save(furniture);
		PieceOfFurniture toRemove = new PieceOfFurniture();
		toRemove.setId(result.getId());
		furnitureRepository.delete(toRemove);
		PieceOfFurniture read = furnitureRepository.findById(result.getId());

		assertEquals(read, null);
	}

}
