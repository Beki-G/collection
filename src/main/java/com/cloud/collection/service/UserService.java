package com.cloud.collection.service;

import com.cloud.collection.dto.request.CreateUser;
import com.cloud.collection.dto.response.UserInfo;
import com.cloud.collection.models.enums.UserType;
import com.cloud.collection.models.user.AdminUser;
import com.cloud.collection.models.user.User;
import com.cloud.collection.repository.AdminUserRepository;
import com.cloud.collection.repository.UserRepository;
import com.cloud.collection.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    Logger log = LogManager.getLogger(UserService.class);

    private final UserRepository repository;
    private final AdminUserRepository adminRepo;
    private final Mapper mapper;

    public UserInfo createUser(CreateUser newUser){
        log.info("Made it to create User in UserService");
        log.info("Incoming User data: {}", newUser);

        if(Objects.equals(newUser.getRole(), UserType.USER.getType())){
            User mappedUser = mapper.userDtoToClass(newUser);
            User createdUser = repository.save(mappedUser);
            log.info("New User: {}", createdUser);
            return mapper.userClassToDto(createdUser);
        }

        if(Objects.equals(newUser.getRole(), UserType.ADMINISTRATOR.getType())){
            AdminUser mappedAdmin = mapper.adminUserDtotoClass(newUser);
            AdminUser createdAdmin = adminRepo.save(mappedAdmin);
            log.info("New Admin data: {}", createdAdmin);
            return mapper.adminUserClassToDto(createdAdmin);
        }

        return new UserInfo();
    }

    public UserInfo getUserInfoById(Long userId){
        User user = repository.getById(userId);
        return mapper.userClassToDto(user);
    }

    public User getUserById(Long userId) throws Exception {
        log.info("User Id: {}", userId);
        User use =  repository.findById(userId).orElseThrow(Exception::new);
        log.info("User retrieved: {}", use);
        return use;
    }

    public UserInfo getUserByUsername(String username){
        User user = repository.findByUsername(username);
        return mapper.userClassToDto(user);
    }

    public Boolean deleteUserById(Long userId){
        repository.deleteById(userId);
        Optional<User> deletedU = repository.findById(userId);
        return deletedU.isEmpty();
    }

    public UserInfo updateUser(CreateUser userInfo, Long userId){
        User updatedInfo = mapper.userDtoToClass(userInfo);
        updatedInfo.setId(userId);
        User updatedUser = repository.save(updatedInfo);
        return mapper.userClassToDto(updatedUser);
    }
}
