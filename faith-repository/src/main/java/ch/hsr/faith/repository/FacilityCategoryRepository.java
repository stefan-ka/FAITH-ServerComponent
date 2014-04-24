package ch.hsr.faith.repository;

import java.util.List;

import ch.hsr.faith.domain.FacilityCategory;

public interface FacilityCategoryRepository {

	public FacilityCategory save(FacilityCategory item);

	public void delete(FacilityCategory item);

	public FacilityCategory findById(Long id);

	public List<FacilityCategory> findAll();

}
