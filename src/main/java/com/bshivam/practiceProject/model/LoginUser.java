package com.bshivam.practiceProject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "loginUsers")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginUser {

    @Id
    String id;

    String userId;

    long loginTime;
}
