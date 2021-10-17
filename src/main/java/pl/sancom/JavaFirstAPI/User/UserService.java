package pl.sancom.JavaFirstAPI.User;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	private List<User> users = Arrays.asList(
			new User(1, "Olek1", "Nowy wpis 1"),
			new User(2, "Olek2", "Nowy wpis 2"),
			new User(3, "Olek3", "Nowy wpis 3")
			);
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getUserById(Integer id) {
		return users.stream().filter(t -> t.getId().equals(id)).findFirst().get();		
	}

}
