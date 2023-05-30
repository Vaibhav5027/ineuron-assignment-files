package in.ineuron.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Person;
import in.ineuron.service.PersonService;

@RestController
@RequestMapping("api/person")
public class PersonController {
  
	@Autowired
	
	private PersonService service;
	@PostMapping("/add")
	public ResponseEntity<?> addPerson(@RequestBody Person person){
		Person registerdPerson = service.addPerson(person);
		if(registerdPerson==null)
			return new ResponseEntity<String>("Person Not Added", HttpStatus.BAD_REQUEST);
		return  new ResponseEntity<Person>(registerdPerson, HttpStatus.CREATED);
	}
}
