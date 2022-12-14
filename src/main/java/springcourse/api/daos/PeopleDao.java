package springcourse.api.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import springcourse.api.entities.without_relations.People;

@Repository
public interface PeopleDao extends JpaRepository<People, Long>{

	// SELECT * FROM People where id = 7;
	@Query("SELECT p FROM People p WHERE p.id = :id")
	public People getById(@PathVariable Long id);
	
}
