package in.ashu.oc.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashu.oc.dto.UserDTO;
import in.ashu.oc.service.UserService;

@RestController
@RequestMapping(path = "/api/v1/users", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {

	private final UserService userService;

	public UserController(final UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public void create(@RequestBody UserDTO userDTO) {
		userService.create(userDTO);
	}

	@GetMapping(path = "{name}")
	public UserDTO get(@PathVariable(name = "name") String name) {
		return userService.get(name);
	}

	@GetMapping
	public List<UserDTO> getAll() {
		return userService.getAll();
	}
}
