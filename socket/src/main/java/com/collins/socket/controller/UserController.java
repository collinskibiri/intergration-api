package com.collins.socket.controller;

import com.collins.socket.model.DatabaseModel;
import com.collins.socket.repository.DatabaseRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    private final DatabaseRepo userRepository;

    public UserController(DatabaseRepo userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<DatabaseModel> getUsers() {
        return userRepository.findAll(); // Fetch all users from DB
    }
}