package com.example.integrationpractice;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

import java.io.File;
import java.nio.file.Files;

public class FileMessageHandler {
    @ServiceActivator
    public void handleFileMessage(Message<File> message) throws Exception {
        File file = message.getPayload();
        System.out.println("📄 Found file: " + file.getName());

        // Read file content
        String content = Files.readString(file.toPath());
        System.out.println("📄 File content:\n" + content);
    }
}
