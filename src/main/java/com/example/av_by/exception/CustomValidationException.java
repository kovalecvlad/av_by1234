package com.example.av_by.exception;

public class CustomValidationException extends RuntimeException
{
    String message;
    public CustomValidationException(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "Validation problem. Error occurred: " + message;
    }
}
