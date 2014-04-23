package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.FacilityCategory;

public interface FacilityService {

	public List<Facility> findAll();

	public Facility add(Facility facility);

	public Facility get(Long id);

	public boolean doesFacilityAlreadyExist(String name, String zip, String street);

	public List<Facility> findByCategory(FacilityCategory facilityCategory);

}
