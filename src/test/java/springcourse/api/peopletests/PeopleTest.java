package springcourse.api.peopletests;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import springcourse.api.daos.PeopleDao;
import springcourse.api.entities.without_relations.People;
import springcourse.api.services.servwithout_relations.PeopleService;

public class PeopleTest {
	
	@Mock
	PeopleDao peopleDao;
	
	PeopleService peopleService = new PeopleService();
	
	@Test
	public void test() {
		
		List<People> people = this.peopleService.getAll();
		
		
		
	}
	
	
}
