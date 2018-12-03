package io.altar.repository;
import io.altar.models.Entity;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;

public class EntityRepository<T extends Entity> {
	private Map<Long, T> map = new HashMap<Long, T>();
	private long currentId = 0;

	private long nextId(){
		currentId++;
		return currentId;
	}
	
	public long createEntity(T entity) {
		entity.setId(currentId);
		map.put(entity.getId(), entity);
		nextId();
		return entity.getId();
	}
	public T fetchEntityById(Long id) {
		return map.get(id);
	}
	public void deleteEntityById(Long id) {
		map.remove(id);
	}
	public void changeEntityById(T entity) {
		map.replace(entity.getId(), entity);
	}
	public Map <Long, T> getMap() {
		return map;
	}
	public  Iterator<T> showAll(){
		return map.values().iterator();
	}
}
