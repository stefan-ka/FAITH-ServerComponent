package ch.hsr.faith.service;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.exception.FAITHException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/service-test-context.xml" })
public class UserAccountServiceTest {

	@Autowired
	private UserAccountService userAccountService;

	@Test
	public void testRegisterUserAccount() throws FAITHException {
		UserAccount userAccount = new UserAccount();
		userAccount.setUserName("testuser");
		userAccount.setPassword("pass123456");
		userAccount.setEmail("mail@faith.ch");

		UserAccount persistentUserAccount = userAccountService.save(userAccount);
		assertNotNull(persistentUserAccount);
		assertNotNull(persistentUserAccount.getId());
		assertTrue(persistentUserAccount.getId() > 0);
		assertEquals("testuser", persistentUserAccount.getUserName());
		assertEquals("mail@faith.ch", persistentUserAccount.getEmail());
		assertEquals("9be40402f45736bcb9502225fad5ec9b", persistentUserAccount.getPassword());
	}

}
