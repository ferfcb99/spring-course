package springcourse.api.interfaces.services.without_relations.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;

import springcourse.api.publics.Response;

public interface IPeopleController<T> {
	
	ResponseEntity<Response<List<T>>> getAll();
	
	ResponseEntity<Response<T>> getById(Long id);

	ResponseEntity<Response<T>> deleteById(Long id);
	
	ResponseEntity<Response<T>> createOrUpdate(T entity);

}
