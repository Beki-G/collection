package com.cloud.collection.dto.response;

import lombok.Data;

@Data
public class UserInfo {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String Bio;
    private Boolean personal;
    private String profilePicId;
}
