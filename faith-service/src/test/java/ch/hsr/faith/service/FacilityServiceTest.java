package ch.hsr.faith.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.Facility;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/service-test-context.xml" })
public class FacilityServiceTest {

	@Autowired
	private FacilityService facilityService;

	Facility organization1, organization2;
	long nonExistingId = 65537;

	@Before
	public void setUp() {
		organization1 = new Facility();
		organization1.setName("Org1");
		organization1 = facilityService.save(organization1);
		organization2 = new Facility();
		organization2.setName("Org2");
		organization2 = facilityService.save(organization2);
	}

	@Test
	public void testFindAll() {
		List<Facility> allFoundOrganizations = facilityService.findAll();
		assertEquals(2, allFoundOrganizations.size());
	}

	@Test
	public void testExistingGet() {
		Facility foundById = facilityService.get(organization1.getId());
		assertEquals(organization1, foundById);

	}

	@Test
	public void testNonExistingGet() {
		Facility foundById = facilityService.get(nonExistingId);
		assertEquals(null, foundById);

	}

	@Test
	public void testOrgAdd() {
		Facility myOrg = new Facility();
		myOrg.setName("myName");
		myOrg = facilityService.save(myOrg);
		assertEquals(myOrg, facilityService.get(myOrg.getId()));
	}

}
