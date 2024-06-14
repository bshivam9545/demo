package com.bshivam.practiceProject.repository;

import com.bshivam.practiceProject.model.LoginUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginUserRepository extends MongoRepository<LoginUser, String> {
    void deleteByUserId(String userId);

    boolean existsByUserId(String userId);
}
