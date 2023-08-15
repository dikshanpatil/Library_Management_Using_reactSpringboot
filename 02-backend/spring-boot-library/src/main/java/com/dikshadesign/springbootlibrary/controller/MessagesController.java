package com.dikshadesign.springbootlibrary.controller;

import com.dikshadesign.springbootlibrary.entity.Message;
import com.dikshadesign.springbootlibrary.requestModels.AdminQuestionRequest;
import com.dikshadesign.springbootlibrary.service.MessagesService;
import com.dikshadesign.springbootlibrary.utils.ExtractJWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("https://localhost:3000")
@RestController

@RequestMapping("/api/messages")
public class MessagesController {
    private MessagesService messagesService;

    @Autowired
    public MessagesController(MessagesService messagesService){
        this.messagesService = messagesService;
    }

    @PostMapping("/secure/add/message")
    public  void postMessage(@RequestHeader(value = "Authorization") String token,
                             @RequestBody Message messageRequest){
        String userEmail = ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
        messagesService.postMessage(messageRequest, userEmail);
    }

    @PutMapping("/secure/admin/message")
    public void putMessage(@RequestHeader(value = "Authorization") String token,
                           @RequestBody AdminQuestionRequest adminQuestionRequest)throws Exception{
        String userEmail = ExtractJWT.payloadJWTExtraction(token, "\"sub\"");
        String userType = ExtractJWT.payloadJWTExtraction(token, "\"userType\"");
        if(userType == null || !userType.equals("admin")){
            throw new Exception("Administration page only!");
        }
        messagesService.putMessage(adminQuestionRequest, userEmail);
    }
}