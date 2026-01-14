package sg.edu.nus.p2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sg.edu.nus.p2.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

}
