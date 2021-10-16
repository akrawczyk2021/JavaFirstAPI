package pl.sancom.JavaFirstAPI.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("/users")
	public String GetAllUsers() {
		return "users";
	}
}
