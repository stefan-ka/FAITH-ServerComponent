package ch.hsr.faith.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.ItemNeeded;
import ch.hsr.faith.repository.ItemNeededRepository;
import ch.hsr.faith.repository.impl.jpa.JpaItemNeededRepository;

@Repository
public class ItemNeededRepositoryImpl implements ItemNeededRepository {

	@Autowired
	private JpaItemNeededRepository jpaItemNeededRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public ItemNeeded save(ItemNeeded item) {
		return jpaItemNeededRepository.saveAndFlush(item);
	}

	@Override
	public void delete(ItemNeeded item) {
		jpaItemNeededRepository.delete(item);
		jpaItemNeededRepository.flush();
	}

	@Override
	public ItemNeeded findById(Long id) {
		return jpaItemNeededRepository.findOne(id);
	}

	@Override
	public List<ItemNeeded> findAll() {
		return jpaItemNeededRepository.findAll();
	}

	@Override
	public List<ItemNeeded> findByFacility(Facility facility) {
		return jpaItemNeededRepository.findByFacility(facility);
	}

}
