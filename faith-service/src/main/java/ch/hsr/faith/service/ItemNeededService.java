package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.ItemNeeded;

public interface ItemNeededService {

	public List<ItemNeeded> findAll();

	public ItemNeeded create(ItemNeeded item);

	public List<ItemNeeded> findByFacility(Facility facility);

}
