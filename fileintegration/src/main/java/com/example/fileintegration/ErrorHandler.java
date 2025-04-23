package com.example.fileintegration;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class ErrorHandler {

    public void handleError(Message<?> message) {
        System.err.println("❌ ERROR during file processing: " + message.getPayload());
    }
}
