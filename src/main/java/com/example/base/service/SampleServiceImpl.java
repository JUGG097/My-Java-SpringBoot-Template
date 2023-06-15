package com.example.base.service;

import com.example.base.entity.SampleEntity;
import com.example.base.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class SampleServiceImpl implements SampleService{
    @Autowired
    private SampleRepository sampleRepository;

    @Override
    public SampleEntity getSample () {
        return SampleEntity.builder()
                .id(1L)
                .name("Sample Name")
                .createdAt(Timestamp.from(Instant.now()))
                .updatedAt(Timestamp.from(Instant.now()))
                .build();
    }
}
