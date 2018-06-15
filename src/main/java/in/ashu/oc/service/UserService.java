package in.ashu.oc.service;

import java.util.List;

import in.ashu.oc.dto.UserDTO;

public interface UserService {

	void create(UserDTO userDTO);

	UserDTO get(String name);

	List<UserDTO> getAll();

	void update(UserDTO userDTO);

	void delete(String name);

}
