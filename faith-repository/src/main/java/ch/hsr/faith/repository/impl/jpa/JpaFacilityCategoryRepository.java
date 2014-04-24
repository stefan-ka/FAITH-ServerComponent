package ch.hsr.faith.repository.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.FacilityCategory;

@Repository
public interface JpaFacilityCategoryRepository extends JpaRepository<FacilityCategory, Long>, JpaSpecificationExecutor<FacilityCategory> {

}
