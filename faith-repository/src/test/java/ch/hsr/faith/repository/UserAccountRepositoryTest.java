package ch.hsr.faith.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import javax.validation.ConstraintViolationException;

import org.junit.After;
import org.junit.Before;
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

	private UserAccount validUserAccount;
	private long inexistendUserId;

	@Before
	public void setUp() {
		validUserAccount = new UserAccount();
		validUserAccount.setPassword("123456");
		validUserAccount.setEmail("test@mail.com");

		validUserAccount = userAccountRepository.save(validUserAccount);
	}

	@After
	public void cleanUp() {
		userAccountRepository.delete(validUserAccount);
	}

	@Test
	public void testCreate() {
		UserAccount accountToCreate = new UserAccount();
		accountToCreate.setEmail("create@faith.ch");
		accountToCreate.setPassword("123456");
		UserAccount createdUserAccount = userAccountRepository.save(accountToCreate);
		assertTrue(createdUserAccount.getId().compareTo(new Long(0)) > 0);
	}

	@Test(expected = ConstraintViolationException.class)
	public void testValidation() {
		UserAccount userAccount = new UserAccount();
		userAccountRepository.save(userAccount);
	}

	@Test
	public void testDelete() {
		UserAccount accountToDelete = new UserAccount();
		accountToDelete.setEmail("todelete@faith.ch");
		accountToDelete.setPassword("123456");
		accountToDelete = userAccountRepository.save(accountToDelete);
		userAccountRepository.delete(accountToDelete);
		assertNull(userAccountRepository.findById(accountToDelete.getId()));
	}

	@Test
	public void testFindById() {
		UserAccount foundById = userAccountRepository.findById(validUserAccount.getId());
		assertNotNull(foundById);
		assertEquals(validUserAccount.getId(), foundById.getId());
	}

	@Test
	public void testFindByEmail() {
		UserAccount foundByEmail = userAccountRepository.findByEmail(validUserAccount.getEmail());
		assertNotNull(foundByEmail);
		assertEquals(validUserAccount.getEmail(), foundByEmail.getEmail());
	}

	@Test
	public void testFindInexistendUserById() {
		assertNull(userAccountRepository.findById(inexistendUserId));
	}

	@Test
	public void testFindInexistendByEmail() {
		assertNull(userAccountRepository.findByEmail("InexistendMailAddress"));
	}
}