package com.example.integrationpractice;

import com.example.integrationpractice.service.EmailRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class DbHandler {

    private final EmailRecordService SERVICE;

    @Autowired
    public DbHandler(EmailRecordService service) {
        SERVICE = service;
    }

    @ServiceActivator(inputChannel = "dbChannel")
    public void saveToDatabase(String emailLine) {
        System.out.println("💾 Saving to DB: " + emailLine);
        SERVICE.save(emailLine);
    }
}