package ch.hsr.faith.repository.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.domain.PieceOfFurniture;

@Repository
public interface JpaPieceOfFurnitureRepository extends JpaRepository<PieceOfFurniture, Long>, JpaSpecificationExecutor<PieceOfFurniture> {

	public abstract List<PieceOfFurniture> findByFurnitureCategory(FurnitureCategory furnitureCategory);

}
