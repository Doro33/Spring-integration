package com.example.integrationpractice.Repository;

import com.example.integrationpractice.entity.EmailRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRecordRepository extends CrudRepository<EmailRecord, Long> {
}
