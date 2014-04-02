package ch.hsr.faith.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.Address;
import ch.hsr.faith.domain.Contact;
import ch.hsr.faith.domain.Organization;
import ch.hsr.faith.domain.OrganizationGroup;
import ch.hsr.faith.domain.UserAccount;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/repository-test-context.xml" })
public class OrganizationRepositoryTest {

	@Autowired
	private OrganizationRepository organizationRepository;

	Organization organization;

	@Before
	public void setUp() {
		organization = new Organization();
		organization.setName("Heim");
		organization.setLevel(3);
	}

	@Test
	public void testOrganizationCreate() {
		organization.setName("CreatOrg");
		Organization persistentOrganization = organizationRepository.save(organization);
		assertEquals(persistentOrganization, organizationRepository.findById(persistentOrganization.getId()));
	}

	@Test
	public void testOrganizationRead() {
		Organization result = organizationRepository.save(organization);
		Organization read = organizationRepository.findById(result.getId());
		
		assertEquals(result, read);
	}

	@Test
	public void testOrganizationUpdate() {

		Organization result = organizationRepository.save(organization);

		
		Organization updatedOrganization = new Organization();
		updatedOrganization.setId(result.getId());
		updatedOrganization.setName("BrockenHaus");
		updatedOrganization.setLevel(1);
		
		organizationRepository.save(organization);
		Organization read = organizationRepository.findById(result.getId());

		assertEquals(organization, read);
	}

	@Test
	public void testOrganizationDelete() {


		Organization result = organizationRepository.save(organization);

		Organization toRemove = new Organization();
		toRemove.setId(result.getId());
		organizationRepository.delete(toRemove);
		Organization read = organizationRepository.findById(result.getId());

		assertEquals(read, null);
	}

}
