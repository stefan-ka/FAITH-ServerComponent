package ch.hsr.faith.repository;

import java.util.List;

import ch.hsr.faith.domain.Facility;


public interface FacilityRepository {
	
	public Facility save(Facility item);

	public void delete(Facility item);

	public Facility findById(Long id);

	public List<Facility> findAll();
	
	public Facility findByNameAndAddress(String name, String zip, String street);

}
