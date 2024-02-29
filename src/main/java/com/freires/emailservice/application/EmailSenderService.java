package com.freires.emailservice.application;

import org.springframework.stereotype.Service;
import com.freires.emailservice.core.EmailSenderUseCase;
import com.freires.emailservice.adapters.EmailSenderGateway;
import org.springframework.beans.factory.annotation.Autowired;


/*
* A Classe de Service implementa a regra de negócio que foi definida no Core( Domain ) da aplicação.
* Isso provê uma melhor independência das camadas da aplicação.
* */
@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway; // pode ser o da google, ou da aws ou outros ...

    @Autowired
    public EmailSenderService( EmailSenderGateway emailGateway ){ this.emailSenderGateway = emailGateway; };

    @Override
    public void sendEmail(String to, String subject, String body) {
        // Service to send Email to any service provider.
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
