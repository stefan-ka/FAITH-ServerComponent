package ch.hsr.faith.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import javax.validation.ConstraintViolationException;

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
		validUserAccount.setUserName("test-user");
		validUserAccount.setPassword("123456");
		validUserAccount.setEmail("test@mail.com");
	}

	@Test
	public void testCreate() {

		UserAccount savedUserAccount = userAccountRepository
				.save(validUserAccount);
		assertTrue(savedUserAccount.getId().compareTo(new Long(0)) > 0);
		assertEquals(savedUserAccount, validUserAccount);
	}

	@Test(expected = ConstraintViolationException.class)
	public void testValidation() {
		UserAccount userAccount = new UserAccount();
		userAccountRepository.save(userAccount);
	}

	@Test
	public void testDelete() {
		validUserAccount.setUserName("UserForDeletionTest");
		UserAccount savedUserAccount = userAccountRepository
				.save(validUserAccount);
		userAccountRepository.delete(savedUserAccount);
		assertNull(userAccountRepository.findById(savedUserAccount.getId()));
	}

	@Test
	public void testFindById() {
		validUserAccount.setUserName("UserForFindByIdNameTest");
		UserAccount savedUserAccount = userAccountRepository
				.save(validUserAccount);
		assertEquals(validUserAccount,
				userAccountRepository.findById(savedUserAccount.getId()));
	}

	@Test
	public void testFindByUserName() {
		validUserAccount.setUserName("UserForFindByUserNameTest");
		UserAccount savedUserAccount = userAccountRepository
				.save(validUserAccount);
		assertEquals(validUserAccount,
				userAccountRepository.findByUserName(savedUserAccount
						.getUserName()));
	}

	@Test
	public void testFindInexistendUserById() {
		assertNull(userAccountRepository.findById(inexistendUserId));
	}

	@Test
	public void testFindInexistendByUserName() {
		assertNull(userAccountRepository
				.findByUserName("InexistendUserName"));
	}
}