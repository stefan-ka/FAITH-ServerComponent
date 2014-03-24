package ch.hsr.faith.repository.impl.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.FurnitureCategory;

@Repository
public interface JpaFurnitureCategoryRepository extends JpaRepository<FurnitureCategory, Long>, JpaSpecificationExecutor<FurnitureCategory> {

	public abstract List<FurnitureCategory> findByParent(FurnitureCategory parent);

}
