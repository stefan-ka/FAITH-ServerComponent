package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.Facility;

public interface FacilityService {

	public List<Facility> findAll();
	
	public Facility add(Facility item);
	
	public Facility get(Long id);

}
