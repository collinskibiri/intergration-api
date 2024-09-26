package com.collins.socket.controller;

import com.collins.socket.Entity.TestTable;
import com.collins.socket.model.UserModel;
import com.collins.socket.repository.DatabaseRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

    private final DatabaseRepo userRepository;

    public UserController(DatabaseRepo userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/users")
    public List<TestTable> getUsers( @RequestBody UserModel userModel) {

        System.out.println(userModel.toString());
        TestTable testTable = new TestTable();

//        testTable.setId(3);
        testTable.setName(userModel.getName());
        testTable.setFirstName(userModel.getFirstName());
        testTable.setSecondName(userModel.getSecondName());
        userRepository.saveAndFlush(testTable);


        return userRepository.findAll(); // Fetch all users from DB
    }
}