package com.cloud.collection.dto.request;

import lombok.Data;

@Data
public class CreateUser {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String Bio;
    private Boolean personal;
    private String profilePicId;
    private String role;
}
