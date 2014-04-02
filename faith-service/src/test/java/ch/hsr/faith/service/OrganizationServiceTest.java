package ch.hsr.faith.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.Organization;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/service-test-context.xml" })
public class OrganizationServiceTest {
	
	@Autowired
	private OrganizationService organizationService;
	
	Organization organization1, organization2;
	long nonExistingId = 65537;
	
	@Before
	public void setUp() { 
		organization1 = new Organization();
		organization1.setName("Org1");
		organization1 = organizationService.add(organization1);
		organization2 = new Organization();
		organization2.setName("Org2");
		organization2 = organizationService.add(organization2);
	}
	
	@Test
	public void testFindAll() {
		List<Organization> allFoundOrganizations = organizationService.findAll();
		assertEquals(2, allFoundOrganizations.size());
	}
	
	@Test
	public void testExistingGet() {
		Organization foundById = organizationService.get(organization1.getId());
		assertEquals(organization1, foundById);
		
	}
	
	@Test
	public void testNonExistingGet() {
		Organization foundById = organizationService.get(nonExistingId);
		assertEquals(null, foundById);
		
	}

	@Test
	public void testOrgAdd() { 
		Organization myOrg = new Organization();
		myOrg.setName("myName");
		myOrg = organizationService.add(myOrg);
		assertEquals(myOrg, organizationService.get(myOrg.getId()));
	}

}
