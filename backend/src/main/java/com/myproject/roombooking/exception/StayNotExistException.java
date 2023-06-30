package com.myproject.roombooking.exception;


public class StayNotExistException extends RuntimeException {


    public StayNotExistException(String message) {
        super(message);
    }
}
