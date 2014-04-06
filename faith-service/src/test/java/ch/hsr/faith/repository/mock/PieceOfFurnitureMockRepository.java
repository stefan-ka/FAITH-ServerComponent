package ch.hsr.faith.repository.mock;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.PieceOfFurniture;
import ch.hsr.faith.repository.PieceOfFurnitureRepository;

@Repository
public class PieceOfFurnitureMockRepository extends AbstractMockRepository<PieceOfFurniture> implements PieceOfFurnitureRepository {

}
