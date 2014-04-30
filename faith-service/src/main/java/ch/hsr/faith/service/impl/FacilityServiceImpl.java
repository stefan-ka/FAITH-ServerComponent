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

		List<FacilityWithDistance> sortedList = new ArrayList<>();
		List<Thread> distanceCalls = new LinkedList<>();

		for (Facility facility : facilities) {
			Thread distanceCall = new DistanceCaller(originLatitude, originLongitude, facility, sortedList);
			distanceCall.start();
			distanceCalls.add(distanceCall);
		}

		for (Thread t : distanceCalls) {
			try {
				t.join();
			} catch (InterruptedException e) {
				Logger.getRootLogger().error("Distance call was interrupted");
			}
		}

		Collections.sort(sortedList);
		return sortedList;
	}

}

class DistanceCaller extends Thread {
	private double originLongitude, originLatitude;
	private Facility facility;
	List<FacilityWithDistance> target;

	public DistanceCaller(double originLatitude, double originLongitude, Facility facility, List<FacilityWithDistance> target) {
		this.originLatitude = originLatitude;
		this.originLongitude = originLongitude;
		this.facility = facility;
		this.target = target;
	}

	@Override
	public void run() {
		int distance = Distances.getDistanceInKm(originLatitude, originLongitude, facility);
		target.add(new FacilityWithDistance(facility, distance));
	}
}
