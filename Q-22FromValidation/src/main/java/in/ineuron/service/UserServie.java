package in.ineuron.service;

import in.ineuron.model.User;

public interface UserServie {
	public User registerUser(User user);
	public User findByUsername(String username);
}
