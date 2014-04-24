package ch.hsr.faith.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.domain.FacilityCategory;
import ch.hsr.faith.repository.FacilityRepository;
import ch.hsr.faith.service.FacilityService;

@Service
public class FacilityServiceImpl implements FacilityService {

	@Autowired
	private FacilityRepository facilityRepository;

	@Override
	public List<Facility> findAll() {
		return facilityRepository.findAll();
	}

	@Override
	public Facility add(Facility facility) {
		return facilityRepository.save(facility);
	}

	@Override
	public Facility get(Long id) {
		return facilityRepository.findById(id);
	}

	@Override
	public List<Facility> findByUserAccount(UserAccount userAccount) {
		return facilityRepository.findByUserAccount(userAccount);
	}
	
	@Override
	public boolean doesFacilityAlreadyExist(String name, String zip, String street) {
		Facility facility = facilityRepository.findByNameAndAddress(name, zip, street);
		return facility != null;
	}

	@Override
	public List<Facility> findByCategory(FacilityCategory facilityCategory) {
		return facilityRepository.findByCategory(facilityCategory);
	}
}
