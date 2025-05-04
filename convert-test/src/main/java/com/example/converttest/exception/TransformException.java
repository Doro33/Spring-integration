package com.example.converttest.exception;

public class TransformException extends RuntimeException {
    public TransformException(String message) {
        super("Failed to convert XML to JSON: " + message);
    }
}
