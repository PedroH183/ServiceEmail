package com.freires.emailservice.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.model.*;
import com.freires.emailservice.adapters.EmailSenderGateway;
import com.freires.emailservice.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import org.springframework.stereotype.Service;

/*
* Aqui é implementado o meu service de email, perceba que estou em uma
* */
@Service
public class SesEmailSender implements EmailSenderGateway {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender( AmazonSimpleEmailService amazonServiceEmail ){
        this.amazonSimpleEmailService = amazonServiceEmail;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {

        // SendEmailRequest é um builder
        SendEmailRequest request = new SendEmailRequest()
                .withSource("pedro_freires18@outlook.com")
                .withDestination(new Destination().withToAddresses(to))
                .withMessage( new Message()
                        .withSubject( new Content(subject) )
                        .withBody( new Body().withText( new Content(body) ) )
                );

        try{
            this.amazonSimpleEmailService.sendEmail(request);
        }catch ( AmazonServiceException exec){
            throw new EmailServiceException("Failure while email");
        }
    }
}
