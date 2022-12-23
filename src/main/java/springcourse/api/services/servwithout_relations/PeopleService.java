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
		People people = this.peopleDao.getById(id);
		return people;
	}

	@Override
	public People deleteById(Long id) {
		try {
			People people = getById(id);
			if(people != null) {
				this.peopleDao.deleteById(id);
				return people;
			}
		}catch(Exception e) {
			return null;
		}
		return null;
	}

	@Override
	public People createOrUpdate(People entity) {
		People people = this.peopleDao.save(entity);
		return people;
	}

	@Override
	public List<People> createOrUpdateList(List<People> people) {
		return this.peopleDao.saveAllAndFlush(people);
	}
	
	
	
	
	

}

