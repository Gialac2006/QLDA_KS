package ut.edu.nhom_qtda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ut.edu.nhom_qtda.models.User;
import ut.edu.nhom_qtda.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean usernameExists(String username) {
        return userRepository.findByUsername(username).isPresent();
    }

    public boolean emailExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
