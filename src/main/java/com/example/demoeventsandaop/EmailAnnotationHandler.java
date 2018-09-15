package com.example.demoeventsandaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmailAnnotationHandler {

    private final EmailService emailService;

    public EmailAnnotationHandler(EmailService emailService) {
        this.emailService = emailService;
    }

    @AfterReturning(value = "@annotation(EmailAfterReturning)", returning = "retVal")
    public void handleSendingEmail(JoinPoint jp, Object retVal) {

        emailService.sendActivationEmail((User) retVal);
    }
}
