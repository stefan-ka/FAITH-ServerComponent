package ch.hsr.faith.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.Furniture;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/repository-test-context.xml" })
public class FurnitureTest {

	@Autowired
	private FurnitureRepository furnitureRepository;

	@Test
	public void test() {
		Furniture furniture = new Furniture();
		furniture.setName("Bett");

		furnitureRepository.save(furniture);
		assertEquals(1, furnitureRepository.findAll().size());
	}

}
