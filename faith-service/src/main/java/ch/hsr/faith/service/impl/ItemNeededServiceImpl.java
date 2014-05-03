package ch.hsr.faith.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.ItemNeeded;
import ch.hsr.faith.repository.ItemNeededRepository;
import ch.hsr.faith.service.ItemNeededService;

@Service
public class ItemNeededServiceImpl implements ItemNeededService {

	@Autowired
	private ItemNeededRepository itemNeededRepository;

	@Override
	public List<ItemNeeded> findAll() {
		return this.itemNeededRepository.findAll();
	}

	@Override
	public ItemNeeded create(ItemNeeded item) {
		return itemNeededRepository.save(item);
	}

	@Override
	public List<ItemNeeded> findByFacility(Facility facility) {
		return itemNeededRepository.findByFacility(facility);
	}

}
