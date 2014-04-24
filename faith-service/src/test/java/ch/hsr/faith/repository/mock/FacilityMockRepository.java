package ch.hsr.faith.repository.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.PieceOfFurniture;
import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.repository.FacilityRepository;

@Repository
public class FacilityMockRepository extends AbstractMockRepository<Facility> implements FacilityRepository {

	@Override
	public Facility findByNameAndAddress(String name, String zip, String street) {
		if ((name == null || "".equals(name)) || (zip == null || "".equals(zip)) || (street == null || "".equals(street)))
			return null;
		for (Facility facility : objectMap.values()) {
			if (name.equals(facility.getName()) && zip.equals(facility.getZip()) && street.equals(facility.getStreet())) {
				return facility;
			}
		}
		return null;
	}
	
	@Override
	public List<Facility> findByUserAccount(UserAccount userAccount) {
		List<Facility> resultList = new ArrayList<Facility>();
		for (Facility facility : objectMap.values()) {
			if (userAccount != null && userAccount.equals(facility.getUserAccount())) {
				resultList.add(facility);
			}
		}
		return resultList;
	}
}
