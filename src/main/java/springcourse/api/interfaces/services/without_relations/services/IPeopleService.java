package springcourse.api.interfaces.services.without_relations.services;

import java.util.List;


public interface IPeopleService<T> {
	
	public List<T> getAll();
	
	public T getById(Long id);
	
	public T deleteById(Long id);
	
	public T createOrUpdate(T entity);
	
	public List<T> createOrUpdateList(List<T> people);
	
}
