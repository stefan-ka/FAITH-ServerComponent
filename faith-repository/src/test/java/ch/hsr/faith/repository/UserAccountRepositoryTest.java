package ch.hsr.faith.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.validation.ConstraintViolationException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hsr.faith.domain.UserAccount;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath*:META-INF/spring/repository-test-context.xml" })
public class UserAccountRepositoryTest {

	@Autowired
	private UserAccountRepository userAccountRepository;

	@Test
	public void testCreate() {
		UserAccount userAccount = new UserAccount();
		userAccount.setUserName("test-user");
		userAccount.setPassword("123456");
		userAccount.setEmail("test@mail.com");

		UserAccount savedUserAccount = userAccountRepository.save(userAccount);
		assertTrue(savedUserAccount.getId().compareTo(new Long(0)) > 0);
		assertEquals(savedUserAccount, userAccount);
	}

	@Test(expected = ConstraintViolationException.class)
	public void testValidation() {
		UserAccount userAccount = new UserAccount();
		userAccountRepository.save(userAccount);
	}

}
