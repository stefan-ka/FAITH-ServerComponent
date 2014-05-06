package ch.hsr.faith.repository.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.FacilityCategory;
import ch.hsr.faith.domain.ItemNeeded;
import ch.hsr.faith.domain.PieceOfFurniture;
import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.repository.FacilityRepository;
import ch.hsr.faith.repository.ItemNeededRepository;
import ch.hsr.faith.repository.PieceOfFurnitureRepository;

@Repository
public class FacilityMockRepository extends AbstractMockRepository<Facility> implements FacilityRepository {

	@Autowired
	private ItemNeededRepository itemNeededRepository;

	@Autowired
	private PieceOfFurnitureRepository pieceOfFurnitureRepository;

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

	@Override
	public List<Facility> findByCategory(FacilityCategory facilityCategory) {
		List<Facility> resultList = new ArrayList<Facility>();
		if (facilityCategory != null) {
			for (Facility facility : objectMap.values()) {
				if (facilityCategory.equals(facility.getFacilityCategory())) {
					resultList.add(facility);
				}
			}
		}
		return resultList;
	}

	@Override
	public List<Facility> findByPieceOfFurnitureNeededId(Long pieceOfFurnitureId) {
		List<Facility> resultList = new ArrayList<Facility>();
		PieceOfFurniture pieceOfFurniture = pieceOfFurnitureRepository.findById(pieceOfFurnitureId);
		if (pieceOfFurniture != null) {
			List<ItemNeeded> listItemsNeeded = itemNeededRepository.findByPieceOfFurniture(pieceOfFurniture);
			for (ItemNeeded itemNeeded : listItemsNeeded) {
				if (itemNeeded.getPieceOfFurniture().equals(pieceOfFurniture)) {
					resultList.add(itemNeeded.getFacility());
				}
			}
		}
		return resultList;
	}
}
