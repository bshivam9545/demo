package com.bshivam.practiceProject.service;

import com.bshivam.practiceProject.model.CreateUserRequest;
import com.bshivam.practiceProject.model.User;
import com.bshivam.practiceProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Service
public class UserManager {

    @Autowired
    UserRepository userRepository;

    public User createUser(CreateUserRequest request) throws Exception {

        try {
            if (userRepository.existsByEmail(request.getEmail())) {
                throw new Exception("User already exists");

            }
            User user = User.builder()
                    .email(request.getEmail())
                    .name(request.getEmail())
                    .createdAt(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC))
                    .build();
            return userRepository.save(user);

        }catch (Exception ex){
            throw ex;

        }
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updatePassword(CreateUserRequest request) {

        User user = userRepository.findByEmail(request.getEmail());
        User nUser = user.builder().password(request.getPassword()).build();
        return userRepository.save(nUser);
    }
}
