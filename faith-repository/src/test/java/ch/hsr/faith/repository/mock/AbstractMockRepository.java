package ch.hsr.faith.repository.mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ch.hsr.faith.domain.BaseEntity;

public abstract class AbstractMockRepository<T extends BaseEntity> {

	protected long nextId = 1;
	protected Map<Long, T> objectMap;

	public AbstractMockRepository() {
		this.objectMap = new HashMap<Long, T>();
	}

	public T save(T item) {
		BaseEntity entity = ((BaseEntity) item);
		if (entity.getId() == null || entity.getId() < 1) {
			entity.setId(nextId);
			nextId++;
		}
		this.objectMap.put(entity.getId(), item);
		return item;
	}

	public void delete(T item) {
		this.objectMap.remove(((BaseEntity) item).getId());
	}

	public T findById(Long id) {
		if (id != null && id > 0) {
			return this.objectMap.get(id);
		}
		return null;
	}

	public List<T> findAll() {
		return new ArrayList<T>(this.objectMap.values());
	}

}
