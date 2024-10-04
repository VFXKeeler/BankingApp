package jkeeler.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jkeeler.Service.UserAccountServiceImpl;
import jkeeler.entity.UserAccount;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/UserAccount")
public class UserAccountRestController {
    @Autowired
    private UserAccountServiceImpl userAccountServiceImpl;

    // Create a new user
    @PostMapping
    public UserAccount createUser(@RequestBody UserAccount user) {
        return userAccountServiceImpl.createAccount(user);
    }

    // Get all users
    @GetMapping
    public List<UserAccount> getAllUsers() {
        return userAccountServiceImpl.viewAllUsers();
    }

    // Get user by ID
    @GetMapping("/{id}")
    public Optional<UserAccount> getUserById(@PathVariable Long id) {
        return userAccountServiceImpl.getUserById(id);
    }

    // Update user by ID
    @PutMapping("/{id}")
    public UserAccount updateUser(@PathVariable Long id, @RequestBody UserAccount userDetails) {
        return userAccountServiceImpl.updateUser(id, userDetails);
    }

    // Delete all users
    @DeleteMapping
    public String deleteAllUsers() {
        userAccountServiceImpl.viewAllUsers();
        return "All users have been deleted successfully.";
    }

    // Delete user by userAccount
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UserAccount userAccount) {
        userAccountServiceImpl.deleteUser(userAccount);
    }
}
