package ch.hsr.faith.repository;

import java.util.List;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.ItemNeeded;
import ch.hsr.faith.domain.PieceOfFurniture;

public interface ItemNeededRepository {

	public ItemNeeded save(ItemNeeded item);

	public void delete(ItemNeeded item);

	public ItemNeeded findById(Long id);

	public List<ItemNeeded> findAll();

	public List<ItemNeeded> findByFacility(Facility facility);
	
	public List<ItemNeeded> findByPieceOfFurniture(PieceOfFurniture pieceOfFurniture);

}
