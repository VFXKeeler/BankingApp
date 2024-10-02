package jkeeler.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jkeeler.Service.UserAccountServiceImpl;
import jkeeler.entity.UserAccount;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/UserAccount")
public class UserAccountController {
    @Autowired
    private UserAccountServiceImpl UserAccountServiceImpl;

    // Create a new user
    @PostMapping
    public UserAccount createUser(@RequestBody UserAccount user) {
        return UserAccountServiceImpl.createAccount(user);
    }

    // Get all users
    @GetMapping
    public List<UserAccount> getAllUsers() {
        return UserAccountServiceImpl.getAllUsers();
    }

    // Get user by ID
    @GetMapping("/{id}")
    public Optional<UserAccount> getUserById(@PathVariable Long id) {
        return UserAccountServiceImpl.getUserById(id);
    }

    // Update user by ID
    @PutMapping("/{id}")
    public UserAccount updateUser(@PathVariable Long id, @RequestBody UserAccount userDetails) {
        return UserAccountServiceImpl.updateUser(id, userDetails);
    }

    // Delete all users
    @DeleteMapping
    public String deleteAllUsers() {
        UserAccountServiceImpl.deleteAllUsers();
        return "All users have been deleted successfully.";
    }

    // Delete user by ID
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        UserAccountServiceImpl.deleteUser(id);
    }
}