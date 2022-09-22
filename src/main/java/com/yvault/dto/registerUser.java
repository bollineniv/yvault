package com.yvault.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class registerUser {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String userName;

    @Indexed(unique = true)
    private String email;
    private String password;
    private userAddress address;
    private LocalDateTime created;

    public registerUser(String firstName,
                        String lastName
            , String userName
            , String email
            , String password
            , userAddress address
            , LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.created = created;
    }

    public registerUser() {
    }
}
