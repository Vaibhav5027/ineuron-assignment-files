package in.ineuron.service;

import in.ineuron.model.Person;

public interface PersonService {
	public Person addPerson(Person person);
	
	public String getWelcomeMsg(String name);
}
