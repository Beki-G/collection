package com.cloud.collection.util;

import com.cloud.collection.dto.request.CreateUser;
import com.cloud.collection.dto.response.AdminUserInfo;
import com.cloud.collection.dto.response.UserInfo;
import com.cloud.collection.models.user.AdminUser;
import com.cloud.collection.models.user.User;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    /**
     * Map from DTO to class
     * @param dto
     * @param targetClass
     * @return
     */
    public  Object dtoToClass(Object dto, Object targetClass){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return mapper.convertValue(dto, targetClass.getClass());
    }

    public User userDtoToClass(CreateUser userInfo){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return mapper.convertValue(userInfo, User.class);
    }

    public UserInfo userClassToDto(User user){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return mapper.convertValue(user, UserInfo.class);
    }

    public AdminUser adminUserDtotoClass(CreateUser userInfo){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return mapper.convertValue(userInfo, AdminUser.class);
    }

    public UserInfo adminUserClassToDto(AdminUser userInfo){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return mapper.convertValue(userInfo, UserInfo.class);
    }
}
