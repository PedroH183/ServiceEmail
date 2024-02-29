package com.freires.emailservice.core;

public record EmailRequestDTO(String to, String subject, String body) {
}
