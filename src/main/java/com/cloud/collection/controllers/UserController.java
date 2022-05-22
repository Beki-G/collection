package com.cloud.collection.controllers;

import com.cloud.collection.dto.request.CreateUser;
import com.cloud.collection.dto.response.UserInfo;
import com.cloud.collection.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Tag(name = "User Controller", description = "Regular User Controller")
@RequiredArgsConstructor
public class UserController {
    Logger log = LogManager.getLogger(UserController.class);

//    @Autowired
    private final UserService service;

    @GetMapping("/{userId}")
    public UserInfo getById(@PathVariable Long userId){
        return service.getUserInfoById(userId);
    }

    @GetMapping("/{userName}")
    public UserInfo getByUsername(@PathVariable String userName){
        return service.getUserByUsername(userName);
    }

    @PostMapping
    public UserInfo createUser(@RequestBody CreateUser newUser){
        log.info("Create User reached in Controller");
        return service.createUser(newUser);
    }

    @DeleteMapping("/{userId}")
    public Boolean deleteUser(@PathVariable Long userId){
        return service.deleteUserById(userId);
    }
}
