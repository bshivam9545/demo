package com.bshivam.practiceProject.controller;


import com.bshivam.practiceProject.model.CreateUserRequest;
import com.bshivam.practiceProject.model.User;
import com.bshivam.practiceProject.service.UserManager;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserManager userManager;

    @PostMapping("/createUser")
    public User createUser(@RequestBody CreateUserRequest request) throws Exception {
        return userManager.createUser(request);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUsers(){
        return userManager.getAllUsers();
    }

    @PutMapping("/updatePassword/")
    public User updatePassword(@RequestBody CreateUserRequest request){
        return userManager.updatePassword(request);

    }
}
