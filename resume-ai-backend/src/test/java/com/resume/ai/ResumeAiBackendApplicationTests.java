package com.resume.ai;

import com.resume.ai.service.ResumeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class ResumeAiBackendApplicationTests {
	@Autowired
	private ResumeService resumeService;

	@Test
	void contextLoads() throws IOException {
		resumeService.generateResumeResponse("I am ironman from marvel");
	}

}
