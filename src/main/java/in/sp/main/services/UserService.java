package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import in.sp.main.entities.User;

public interface UserService {
	public User createUser(User user);
	
	public List<User> getAllUsers();
	public Optional<User> getUser(int id);
	
	public User updateUserDetails(int id, User newUser);
	
	public void deleteUser(int id);
}
