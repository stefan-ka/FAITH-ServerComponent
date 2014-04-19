package ch.hsr.faith.repository.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.FurnitureCategory;
import ch.hsr.faith.domain.PieceOfFurniture;
import ch.hsr.faith.repository.PieceOfFurnitureRepository;

@Repository
public class PieceOfFurnitureMockRepository extends AbstractMockRepository<PieceOfFurniture> implements PieceOfFurnitureRepository {

	@Override
	public List<PieceOfFurniture> findByCategory(FurnitureCategory furnitureCategory) {
		List<PieceOfFurniture> resultList = new ArrayList<PieceOfFurniture>();
		for (PieceOfFurniture pieceOfFurniture : objectMap.values()) {
			if (furnitureCategory != null && furnitureCategory.equals(pieceOfFurniture.getFurnitureCategory())) {
				resultList.add(pieceOfFurniture);
			}
		}
		return resultList;
	}

}
