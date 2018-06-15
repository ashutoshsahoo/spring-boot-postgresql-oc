package in.ashu.oc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashu.oc.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByName(String name);
}
