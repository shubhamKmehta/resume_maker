package com.resume.ai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ResumeServiceImpl {

    private ChatClient chatClient;

    public ResumeServiceImpl(ChatClient.Builder builder){this.chatClient=builder.build();}


}
