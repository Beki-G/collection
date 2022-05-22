package com.cloud.collection.exception.notfound;

import com.cloud.collection.exception.NotFoundException;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(){ super("User does not exist.");}
}
