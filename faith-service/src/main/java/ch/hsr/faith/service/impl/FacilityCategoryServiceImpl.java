package ch.hsr.faith.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.hsr.faith.domain.FacilityCategory;
import ch.hsr.faith.repository.FacilityCategoryRepository;
import ch.hsr.faith.service.FacilityCategoryService;

@Service
public class FacilityCategoryServiceImpl implements FacilityCategoryService {

	@Autowired
	private FacilityCategoryRepository facilityCategoryRepository;

	@Override
	public List<FacilityCategory> findAll() {
		return facilityCategoryRepository.findAll();
	}

	@Override
	public FacilityCategory findById(Long id) {
		return facilityCategoryRepository.findById(id);
	}

}
