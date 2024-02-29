package com.freires.emailservice.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.freires.emailservice.core.EmailRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import com.freires.emailservice.application.EmailSenderService;
import com.freires.emailservice.core.exceptions.EmailServiceException;


@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController( EmailSenderService emailSenderService ){
        this.emailSenderService = emailSenderService;
    }

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequestDTO request ){
        try{
            this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
            return ResponseEntity.ok().body("Email Enviado com Sucesso !!");

        }catch ( EmailServiceException exec){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exec.getMessage());
        }
    }


}
