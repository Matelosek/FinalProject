package pl.coderslab.repository;

import jakarta.validation.constraints.Email;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String username);
    @EntityGraph(attributePaths = "roles")
    Optional<User> findByLogin(String login);


}
