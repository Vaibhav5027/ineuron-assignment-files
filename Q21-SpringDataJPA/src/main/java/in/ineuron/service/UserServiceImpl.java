package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.User;
import in.ineuron.repo.UserRepo;

@Service("userservice")
public class UserServiceImpl implements UserService {
  
	@Autowired
	private UserRepo repo;
	@Override
	public User save(User user) {
		   
		return repo.save(user);
	}

}
