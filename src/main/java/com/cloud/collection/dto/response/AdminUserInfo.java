package com.cloud.collection.dto.response;

import lombok.Data;

@Data
public class AdminUserInfo {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
}

