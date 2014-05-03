package ch.hsr.faith.repository.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.ItemNeeded;
import ch.hsr.faith.repository.ItemNeededRepository;

@Repository
public class ItemNeededMockRepository extends AbstractMockRepository<ItemNeeded> implements ItemNeededRepository {

	@Override
	public List<ItemNeeded> findByFacility(Facility facility) {
		List<ItemNeeded> resultList = new ArrayList<ItemNeeded>();
		for (ItemNeeded itemNeeded : objectMap.values()) {
			if (facility != null && facility.equals(itemNeeded.getFacility())) {
				resultList.add(itemNeeded);
			}
		}
		return resultList;
	}

}
