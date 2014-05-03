package ch.hsr.faith.repository;

import java.util.List;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.ItemNeeded;

public interface ItemNeededRepository {

	public ItemNeeded save(ItemNeeded item);

	public void delete(ItemNeeded item);

	public ItemNeeded findById(Long id);

	public List<ItemNeeded> findAll();

	public List<ItemNeeded> findByFacility(Facility facility);

}
