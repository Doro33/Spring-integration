package com.example.integrationpractice;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

public class LineMessageHandler {
    @ServiceActivator
    public void handleLine(Message<String> message) {
        String line = message.getPayload();
        System.out.println("📝 Processing line: " + line);
    }
}