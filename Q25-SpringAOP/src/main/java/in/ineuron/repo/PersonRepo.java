package in.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ineuron.model.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}
