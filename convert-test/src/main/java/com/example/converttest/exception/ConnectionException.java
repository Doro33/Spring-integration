package com.example.converttest.exception;

import java.io.IOException;

public class ConnectionException extends IOException {
    public ConnectionException(String message) {
        super("Failed to call SOAP service: " + message);
    }
}
