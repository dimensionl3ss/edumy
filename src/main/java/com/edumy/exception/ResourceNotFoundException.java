package com.edumy.exception;

public class ResourceNotFoundException extends Exception{
    public ResourceNotFoundException(String err) {
        super(err);
    }
}