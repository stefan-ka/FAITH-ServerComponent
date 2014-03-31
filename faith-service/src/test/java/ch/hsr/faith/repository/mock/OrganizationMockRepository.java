package ch.hsr.faith.repository.mock;

import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Organization;
import ch.hsr.faith.repository.OrganizationRepository;

@Repository
public class OrganizationMockRepository extends AbstractMockRepository<Organization> implements OrganizationRepository {

}
