package ch.hsr.faith.repository.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.ItemNeeded;
import ch.hsr.faith.domain.PieceOfFurniture;

@Repository
public interface JpaItemNeededRepository extends JpaRepository<ItemNeeded, Long>, JpaSpecificationExecutor<ItemNeeded> {

	public abstract List<ItemNeeded> findByFacility(Facility facility);

	public abstract List<ItemNeeded> findByPieceOfFurniture(PieceOfFurniture pieceOfFurniture);

}
