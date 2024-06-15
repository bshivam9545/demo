package com.bshivam.practiceProject.controller;


import com.bshivam.practiceProject.model.LoginUser;
import com.bshivam.practiceProject.model.LoginUserRequest;
import com.bshivam.practiceProject.service.LoginUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    LoginUserManager loginUserManager;

    @PutMapping("/login")
    public LoginUser login(@RequestBody LoginUserRequest request) throws Exception {
        return loginUserManager.loginUser(request);
    }

    @DeleteMapping("/logout/{email}")
    public boolean logout(@PathVariable String email) throws Exception {
        loginUserManager.logoutUser(email);
        return true;
    }
}
