package com.example.integrationpractice;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

public class MyMessageHandler {
    @ServiceActivator
    public void handleMessage(Message<String> message) {
        System.out.println("Received message: " + message.getPayload());
    }
}