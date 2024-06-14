package com.bshivam.practiceProject.repository;

import com.bshivam.practiceProject.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    boolean existsByEmail(String email);

    User findByEmail(String email);
}
