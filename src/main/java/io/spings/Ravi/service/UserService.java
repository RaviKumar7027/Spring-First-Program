


package io.spings.Ravi.service;
import java.util.*;

import io.spings.Ravi.model.User;
import io.spings.Ravi.repository.UserRepository;
import io.spings.Ravi.exception.UserNotFoundException;  // Ensure to import your custom exception
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.spings.Ravi.controller.UserController;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to create and save user
    public User createUser(long id, String name, String email) {
        User user = new User();
        user.setId(id);
        user.setName(name);   // Set name
        user.setEmail(email); // Set email
        return userRepository.save(user); // Save to database
    }

    // Updating user
    public User updateUser(Long id, String name, String email) {
        User exist = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + id));

        exist.setName(name);
        exist.setEmail(email);

        return userRepository.save(exist);
    }

    // Deleting user
    public void deleteUser(Long id) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + id));

        userRepository.delete(existingUser);
    }

    // Getting all users
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    // Get a single user by ID
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + id));
    }
}
