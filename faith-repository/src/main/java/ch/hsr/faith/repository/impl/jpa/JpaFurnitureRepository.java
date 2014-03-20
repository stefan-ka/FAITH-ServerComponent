package ch.hsr.faith.repository.impl.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Furniture;

@Repository
public interface JpaFurnitureRepository extends JpaRepository<Furniture, Long>, JpaSpecificationExecutor<Furniture> {

}
