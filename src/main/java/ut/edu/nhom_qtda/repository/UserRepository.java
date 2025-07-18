package ut.edu.nhom_qtda.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ut.edu.nhom_qtda.models.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}

