package com.freires.emailservice.core;

/*
    Na camada Core nos temos os casos de uso da nossa aplicação definidos.
    Representa as regras de negócio da minha aplicação.
*/

public interface EmailSenderUseCase {
    void sendEmail( String to, String subject, String body );
}
