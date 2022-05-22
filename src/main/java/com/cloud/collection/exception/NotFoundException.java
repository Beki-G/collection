package com.cloud.collection.exception;

public class NotFoundException extends ResponseEntityException{
    public NotFoundException(String message){super(message);}
}
