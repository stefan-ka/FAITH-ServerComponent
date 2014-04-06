package ch.hsr.faith.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.Facility;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/repository-test-context.xml" })
public class FacilityRepositoryTest {

	@Autowired
	private FacilityRepository organizationRepository;

	Facility organization;

	@Before
	public void setUp() {
		organization = new Facility();
		organization.setName("Heim");
		organization.setLevel(3);
	}

	@Test
	public void testOrganizationCreate() {
		organization.setName("CreatOrg");
		Facility persistentOrganization = organizationRepository.save(organization);
		assertEquals(persistentOrganization, organizationRepository.findById(persistentOrganization.getId()));
	}

	@Test
	public void testOrganizationRead() {
		Facility result = organizationRepository.save(organization);
		Facility read = organizationRepository.findById(result.getId());
		
		assertEquals(result, read);
	}

	@Test
	public void testOrganizationUpdate() {

		Facility result = organizationRepository.save(organization);

		
		Facility updatedOrganization = new Facility();
		updatedOrganization.setId(result.getId());
		updatedOrganization.setName("BrockenHaus");
		updatedOrganization.setLevel(1);
		
		organizationRepository.save(organization);
		Facility read = organizationRepository.findById(result.getId());

		assertEquals(organization, read);
	}

	@Test
	public void testOrganizationDelete() {


		Facility result = organizationRepository.save(organization);

		Facility toRemove = new Facility();
		toRemove.setId(result.getId());
		organizationRepository.delete(toRemove);
		Facility read = organizationRepository.findById(result.getId());

		assertEquals(read, null);
	}

}
