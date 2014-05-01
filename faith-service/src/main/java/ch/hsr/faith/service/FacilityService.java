package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.FacilityCategory;
import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.domain.FacilityWithDistance;

public interface FacilityService {

	public List<Facility> findAll();

	public Facility add(Facility facility);

	public Facility get(Long id);

	public List<Facility> findByUserAccount(UserAccount userAccount);

	public boolean doesFacilityAlreadyExist(String name, String zip, String street);

	public List<Facility> findByCategory(FacilityCategory facilityCategory);

	public List<FacilityWithDistance> fetchDistance(List<Facility> facilities, double originLatitude, double originLongitude);
}