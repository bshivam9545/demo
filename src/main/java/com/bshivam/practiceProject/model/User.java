package com.bshivam.practiceProject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@Document(collection = "user")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    String userId;

    String name;

    String email;

    Long createdAt;

    String password;
}

