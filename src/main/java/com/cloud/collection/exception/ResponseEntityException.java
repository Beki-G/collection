package com.cloud.collection.exception;

public abstract class ResponseEntityException extends RuntimeException{
    public ResponseEntityException(String message){ super(message);}
}
