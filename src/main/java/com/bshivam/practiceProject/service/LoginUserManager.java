package com.bshivam.practiceProject.service;


import com.bshivam.practiceProject.model.LoginUser;
import com.bshivam.practiceProject.model.LoginUserRequest;
import com.bshivam.practiceProject.model.User;
import com.bshivam.practiceProject.repository.LoginUserRepository;
import com.bshivam.practiceProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class LoginUserManager {

    @Autowired
    LoginUserRepository loginUserRepository;

    @Autowired
    UserRepository userRepository;

    public LoginUser loginUser(LoginUserRequest request) throws Exception {

        if(userRepository.existsByEmail(request.getEmail())){
            User user = userRepository.findByEmail(request.getEmail());
            LoginUser loginUser = LoginUser.builder()
                    .userId(user.getUserId())
                    .loginTime(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC))
                    .build();
            return loginUserRepository.save(loginUser);
        }
        throw new Exception("User Not exist");
    }

    public LoginUser logoutUser(String email) throws Exception {
        if(userRepository.existsByEmail(email)){
            User user = userRepository.findByEmail(email);
            LoginUser loginUser = LoginUser.builder()
                    .userId(user.getUserId())
                    .loginTime(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC))
                    .build();
            if(loginUserRepository.existsByUserId(user.getUserId())){
                loginUserRepository.deleteByUserId(user.getUserId());
            }else{
                throw new Exception("User not login");
            }

        }
        throw new Exception("User Not exist");
    }
}
