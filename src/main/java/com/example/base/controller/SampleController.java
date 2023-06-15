package com.example.base.controller;

import com.example.base.entity.SampleEntity;
import com.example.base.response.ResponseHandler;
import com.example.base.service.SampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/api/v1/", produces = MediaType.APPLICATION_JSON_VALUE)
public class SampleController {

    @Autowired
    ResponseHandler responseHandler;

    @Autowired
    SampleServiceImpl sampleService;

    @GetMapping("/check")
    public ResponseEntity<Object> serverCheck() {
        return responseHandler.generateResponse(
                true,
                HttpStatus.OK,
                "Server is up and running");
    }

    @GetMapping("/sample")
    public ResponseEntity<Object> getSampleData() {
        SampleEntity sampleData = sampleService.getSample();
        return responseHandler.generateResponse(
                true,
                HttpStatus.OK,
                sampleData);
    }
}
