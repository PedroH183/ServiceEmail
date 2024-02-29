package com.freires.emailservice.adapters;

/*
* Contrato para que os controllers possam usar os adapter da maneira correta.
* Não representa regra de negócio, e sim a interface de comunicação com o service escolhido no caso (AWS SES).
* */

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
