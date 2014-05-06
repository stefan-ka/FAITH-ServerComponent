package ch.hsr.faith.repository.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.FacilityCategory;
import ch.hsr.faith.domain.UserAccount;

@Repository
public interface JpaFacilityRepository extends JpaRepository<Facility, Long>, JpaSpecificationExecutor<Facility> {

	public abstract List<Facility> findByName(String name);

	public abstract List<Facility> findByUserAccount(UserAccount userAccount);

	public abstract List<Facility> findByFacilityCategory(FacilityCategory facilityCategory);

	@Query(value = "SELECT f from Facility f, PieceOfFurniture p, ItemNeeded i where f.id = i.facility.id and p.id = i.pieceOfFurniture.id and p.id = :pieceOfFurnitureId")
	public abstract List<Facility> findByPieceOfFurnitureNeededId(@Param(value = "pieceOfFurnitureId") Long pieceOfFurnitureId);

}
