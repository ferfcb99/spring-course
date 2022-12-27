package springcourse.api.controllers.without_relations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import springcourse.api.entities.without_relations.People;
import springcourse.api.interfaces.services.without_relations.controllers.IPeopleController;
import springcourse.api.publics.Response;
import springcourse.api.services.servwithout_relations.PeopleService;

import springcourse.api.publics.Constants;

// http://localhost:8084/
// http://localhost:8084/api/v1/people-controller/getAll
@RestController
@RequestMapping(value = "api/v1/people-controller")
public class PeopleController implements IPeopleController<People> {

	@Autowired
	PeopleService peopleService;

	Constants constants = new Constants();

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET, value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<List<People>>> getAll() {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.peopleService.getAll(),
				Constants.GET_DATA_SUCCESSFULLY));
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET, value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<People>> getById(@PathVariable Long id) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.peopleService.getById(id),
				Constants.GET_DATA_SUCCESSFULLY));
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<People>> deleteById(@PathVariable Long id) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK), this.peopleService.deleteById(id),
				Constants.DELETE_DATA_SUCCESSFULLY));
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.POST, value = "/createOrUpdate", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<People>> createOrUpdate(@RequestBody People entity) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK),
				this.peopleService.createOrUpdate(entity), Constants.CREATE_DATA_SUCCESSFULLY));
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.POST, value = "/createOrUpdateList", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response<List<People>>> createOrUpdateList(@RequestBody List<People> entities) {
		return ResponseEntity.ok(new Response<>(String.valueOf(HttpStatus.OK),
				this.peopleService.createOrUpdateList(entities), Constants.CREATE_DATA_SUCCESSFULLY));
	}

}
