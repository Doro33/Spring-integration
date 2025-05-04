package com.example.converttest.exception;

public class IdException extends IllegalStateException{
    public IdException() {
        super("Id must be from 1 to 1000.");
    }
}
