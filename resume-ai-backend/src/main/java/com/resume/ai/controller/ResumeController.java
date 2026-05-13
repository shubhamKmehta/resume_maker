package com.resume.ai.controller;

import com.resume.ai.ResumeRequest;
import com.resume.ai.service.ResumeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/resume")
public class ResumeController {
    private ResumeService resumeService;
    public ResumeController(ResumeService resumeService){
        this.resumeService=resumeService;
    }

    @PostMapping("/generate")
    public ResponseEntity<Map<String, Object>> getResumeDat(
            @RequestBody ResumeRequest resumeRequest
            )throws IOException{
        Map<String,Object> stringObjectMap = resumeService.generateResumeResponse(resumeRequest.userDescription());
        return new ResponseEntity<>(stringObjectMap, HttpStatus.OK);
    }
}
