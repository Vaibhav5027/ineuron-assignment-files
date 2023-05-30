package in.ineuron.repo;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
