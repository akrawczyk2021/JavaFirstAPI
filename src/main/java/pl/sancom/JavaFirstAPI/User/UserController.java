package pl.sancom.JavaFirstAPI.User;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public List<User> GetAllUsers() {
		return Arrays.asList(
				new User(1, "Olek1", "Nowy wpis 1"),
				new User(1, "Olek2", "Nowy wpis 2"),
				new User(1, "Olek3", "Nowy wpis 3")
				);
	}
	
	@RequestMapping("/users/{id}")
	public User getUserById(@PathVariable Integer id) {
		return userService.getUserById(id);
	}
}
