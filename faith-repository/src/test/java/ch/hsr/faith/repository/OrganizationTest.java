package ch.hsr.faith.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.Organization;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/repository-test-context.xml" })
public class OrganizationTest {

	@Autowired
	private OrganizationRepository organizationRepository;

	@Test
	public void testOrganizationCreate() {
		Organization organization = new Organization();
		organization.setName("Heim");

		// TODO: @Mathias: please fix ...
		// organization.setCity("Rapperswil");
		// organization.setZip(8640);
		// organization.setHomepage("www.faith.com");
		// organization.setAddress("Eichfeldstrasse 20");
		// organization.setState(3);

		organizationRepository.save(organization);
		assertEquals(1, organizationRepository.findAll().size());
	}

	@Test
	public void testOrganizationRead() {
		Organization organization = new Organization();
		organization.setName("Heim");
		// TODO: @Mathias: please fix ...
		// organization.setCity("Rapperswil");
		// organization.setZip(8640);
		// organization.setHomepage("www.faith.com");
		// organization.setAddress("Eichfeldstrasse 20");
		// organization.setState(3);

		Organization result = organizationRepository.save(organization);
		Organization read = organizationRepository.findById(result.getId());

		// TODO: @Mathias: Objekte koennen nicht so verglichen werden!
		// (equals-Methode wurde in den Domain-Objekten nicht implementiert)
		// assertEquals(result, read);
	}

	@Test
	public void testOrganizationUpdate() {
		Organization organization = new Organization();
		organization.setName("Heim");
		// TODO: @Mathias: please fix ...
		// organization.setCity("Rapperswil");
		// organization.setZip(8640);
		// organization.setHomepage("www.faith.com");
		// organization.setAddress("Eichfeldstrasse 20");
		// organization.setState(3);

		Organization result = organizationRepository.save(organization);

		organization = new Organization();
		organization.setId(result.getId());
		organization.setName("BrockenHaus");
		// TODO: @Mathias: please fix ...
		// organization.setCity("Grabs");
		// organization.setZip(9472);
		// organization.setHomepage("www.grabs.ch");
		// organization.setAddress("Leversberg 2456");
		// organization.setState(2);

		organizationRepository.save(organization);

		Organization read = organizationRepository.findById(result.getId());

		// TODO: @Mathias: Objekte koennen nicht so verglichen werden!
		// (equals-Methode wurde in den Domain-Objekten nicht implementiert)
		// assertEquals(organization, read);
	}

	@Test
	public void testOrganizationDelete() {
		Organization organization = new Organization();
		organization.setName("Heim");
		// TODO: @Mathias: please fix ...
		// organization.setCity("Rapperswil");
		// organization.setZip(8640);
		// organization.setHomepage("www.faith.com");
		// organization.setAddress("Eichfeldstrasse 20");
		// organization.setState(3);

		Organization result = organizationRepository.save(organization);

		Organization toRemove = new Organization();
		toRemove.setId(result.getId());
		organizationRepository.delete(toRemove);
		Organization read = organizationRepository.findById(result.getId());

		assertEquals(read, null);
	}

}
