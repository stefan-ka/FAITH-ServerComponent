package ch.hsr.faith.repository.mock;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Furniture;
import ch.hsr.faith.repository.FurnitureRepository;

@Repository
public class FurnitureMockRepository extends AbstractMockRepository<Furniture> implements FurnitureRepository {

}
