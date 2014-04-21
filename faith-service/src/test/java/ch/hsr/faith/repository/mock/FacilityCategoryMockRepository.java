package ch.hsr.faith.repository.mock;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.FacilityCategory;
import ch.hsr.faith.repository.FacilityCategoryRepository;

@Repository
public class FacilityCategoryMockRepository extends AbstractMockRepository<FacilityCategory> implements FacilityCategoryRepository {

}
