package com.resume.ai.service;

import java.io.IOException;

public interface ResumeService  {
    String generateResumeResponse(String userResumeDescription)throws IOException;
}
