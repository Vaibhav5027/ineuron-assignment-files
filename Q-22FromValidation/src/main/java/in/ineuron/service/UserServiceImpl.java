package in.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.model.User;
import in.ineuron.repo.UserRepo;

@Service
public class UserServiceImpl implements UserServie {
	@Autowired
	private UserRepo repo;

	@Override
	public User registerUser(User user) {
       
		return  repo.save(user); 
	}

	@Override
	public User findByUsername(String username) {
		return repo.findByUsername(username);
		
	}

}
