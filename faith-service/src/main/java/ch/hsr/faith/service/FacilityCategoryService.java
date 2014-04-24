package ch.hsr.faith.service;

import java.util.List;

import ch.hsr.faith.domain.FacilityCategory;

public interface FacilityCategoryService {

	public List<FacilityCategory> findAll();

	public FacilityCategory findById(Long id);

}
