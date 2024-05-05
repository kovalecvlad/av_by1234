package com.example.av_by.exception;

import jakarta.validation.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler({CustomValidationException.class, ValidationException.class})
    public ResponseEntity<HttpStatus> handleCustomValidationException(CustomValidationException ex) {
        log.error("Error occurred: " + ex);
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}