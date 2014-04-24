package ch.hsr.faith.repository.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.FacilityCategory;
import ch.hsr.faith.domain.UserAccount;

@Repository
public interface JpaFacilityRepository extends JpaRepository<Facility, Long>, JpaSpecificationExecutor<Facility> {

	public abstract List<Facility> findByName(String name);
	
	public abstract List<Facility> findByUserAccount(UserAccount userAccount);

	public abstract List<Facility> findByFacilityCategory(FacilityCategory facilityCategory);

}
