package in.ashu.oc.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import in.ashu.oc.dto.UserDTO;
import in.ashu.oc.model.User;
import in.ashu.oc.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepo;	
	
	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public void create(UserDTO userDTO) {
		User user = new User(userDTO.getName(), userDTO.getAge());
		userRepo.saveAndFlush(user);
	}

	@Override
	public UserDTO get(String name) {
		User user = userRepo.findByName(name);
		return new UserDTO(user.getName(),user.getAge());
	}

	@Override
	public List<UserDTO> getAll() {
		return userRepo.findAll().parallelStream().map(this::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public void update(UserDTO userDTO) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		
	}

	
	private UserDTO convertToDTO(User user) {
		return new UserDTO(user.getName(), user.getAge());
	}
}
