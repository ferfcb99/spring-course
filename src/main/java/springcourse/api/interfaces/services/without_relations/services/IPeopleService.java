package springcourse.api.interfaces.services.without_relations.services;

import java.util.List;

import org.springframework.stereotype.Service;



public interface IPeopleService<T> {
	
	public List<T> getAll();
	
	public T getById(Long id);
	
	public T deleteById(Long id);
	
	public T createOrUpdate(T entity);
	
}
