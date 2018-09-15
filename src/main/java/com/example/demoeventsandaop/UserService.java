package com.example.demoeventsandaop;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final EmailService emailService;

    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    @EmailAfterReturning
    public User createUser(UserInfo info) {
        User user = info.toUser();

        // validate user info

        // save the user to the database

        // emailService.sendActivationEmail(user);

        return user;
    }
}
