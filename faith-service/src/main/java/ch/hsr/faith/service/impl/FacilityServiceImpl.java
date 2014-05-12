package ch.hsr.faith.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.FacilityCategory;
import ch.hsr.faith.domain.FacilityWithDistance;
import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.repository.FacilityRepository;
import ch.hsr.faith.service.FacilityService;
import ch.hsr.faith.service.util.CoordinateFetcher;
import ch.hsr.faith.service.util.Distances;

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

	@Override
	public List<FacilityWithDistance> fetchDistance(List<Facility> facilities, double originLatitude, double originLongitude) {
		return new Distances(originLatitude, originLongitude).addDistanceToFaciliies(facilities);
	
	}

	@Override
	public List<Facility> findByPieceOfFurnitureNeededId(Long pieceOfFurnitureId) {
		return facilityRepository.findByPieceOfFurnitureNeededId(pieceOfFurnitureId);
	}

	@Override
	public Facility addAndFetchCoordinates(Facility facility) {
		new CoordinateFetcher().addGPStoFacility(facility);
		return add(facility);
	}

}
