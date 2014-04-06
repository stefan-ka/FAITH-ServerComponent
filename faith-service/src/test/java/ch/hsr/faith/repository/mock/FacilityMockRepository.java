package ch.hsr.faith.repository.mock;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.repository.FacilityRepository;

@Repository
public class FacilityMockRepository extends AbstractMockRepository<Facility> implements FacilityRepository {

}
