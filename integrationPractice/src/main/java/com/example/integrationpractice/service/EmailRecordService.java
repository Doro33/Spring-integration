package com.example.integrationpractice.service;

import com.example.integrationpractice.Repository.EmailRecordRepository;
import com.example.integrationpractice.entity.EmailRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailRecordService {
    private final EmailRecordRepository REPOSITORY;

    @Autowired
    public EmailRecordService(EmailRecordRepository repository) {
        this.REPOSITORY = repository;
    }

    public void save(String email) {
        REPOSITORY.save(new EmailRecord(email));
    }
}
