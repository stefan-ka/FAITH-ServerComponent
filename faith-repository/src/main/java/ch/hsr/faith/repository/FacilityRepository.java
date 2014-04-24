package ch.hsr.faith.repository;

import java.util.List;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.UserAccount;
import ch.hsr.faith.domain.FacilityCategory;


public interface FacilityRepository {
	
	public Facility save(Facility item);

	public void delete(Facility item);

	public Facility findById(Long id);

	public List<Facility> findAll();

	public List<Facility> findByUserAccount(UserAccount userAccount);
	
	public List<Facility> findByCategory(FacilityCategory facilityCategory);
	
	public Facility findByNameAndAddress(String name, String zip, String street);

}
