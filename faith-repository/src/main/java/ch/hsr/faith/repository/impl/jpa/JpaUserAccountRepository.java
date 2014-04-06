package ch.hsr.faith.repository.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.UserAccount;

@Repository
public interface JpaUserAccountRepository extends JpaRepository<UserAccount, Long>, JpaSpecificationExecutor<UserAccount> {

	public abstract List<UserAccount> findByEmail(String email);

}
