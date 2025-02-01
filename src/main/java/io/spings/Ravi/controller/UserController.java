
package io.spings.Ravi.controller;

import io.spings.Ravi.model.User;
import io.spings.Ravi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;  // Injecting UserService

    // POST request to add a new user
    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user.getId(), user.getName(), user.getEmail());  // Call the service to save user
    }

    // PUT request to update an existing user
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user.getName(), user.getEmail());
    }

    // DELETE request to delete a user
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User with ID " + id + " has been deleted successfully!";
    }

    // GET request to fetch all users
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();  // Calling service to get all users
    }

    // GET request to fetch a single user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);  // Calling service to fetch user by ID
    }
}
