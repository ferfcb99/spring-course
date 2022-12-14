package springcourse.api.services.servwithout_relations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springcourse.api.daos.PeopleDao;
import springcourse.api.entities.without_relations.People;
import springcourse.api.interfaces.services.without_relations.services.IPeopleService;

@Service
public class PeopleService implements IPeopleService<People>{
	
	@Autowired
	PeopleDao peopleDao;

	@Override
	public List<People> getAll() {
		List<People> people = this.peopleDao.findAll();
		return people;
	}

	@Override
	public People getById(Long id) {
		return null;
	}

	@Override
	public People deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public People createOrUpdate(People entity) {
		People people = this.peopleDao.save(entity);
		return people;
	}

}
