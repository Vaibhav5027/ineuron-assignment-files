package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.Person;
import in.ineuron.repo.PersonRepo;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	private PersonRepo repo;

	@Override
	public Person addPerson(Person person) {

		return repo.save(person);
	}

}
