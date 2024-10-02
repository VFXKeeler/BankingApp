package jkeeler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jkeeler.RelationMapping.JPARepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private JPARepository JPARepository;

    // Create a new user
    public User createUser(User user) {
        System.out.println(user.getName());
        return JPARepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return JPARepository.findAll();
    }

    // Get user by ID
    public Optional<User> getUserById(Long id) {
        return JPARepository.findById(id);
    }

    // Update user
    public User updateUser(Long id, User userDetails) {
        Optional<User> user = JPARepository.findById(id);
        if (user.isPresent()) {
            User existingUser = user.get();
            existingUser.setName(userDetails.getName());
            existingUser.setPassword(userDetails.getPassword());
            return JPARepository.save(existingUser);
        }
        return null;
    }

    // Delete all users
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }

    // Delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // Other business logic related to users
}