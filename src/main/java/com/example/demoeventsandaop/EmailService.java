package com.example.demoeventsandaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Async
public class EmailService {

    private static final Logger LOG = LoggerFactory.getLogger(EmailService.class);

    public void sendActivationEmail(User user) {
        LOG.info("Send email to user {}", user.getEmail());

        // actually sending an email to the user
    }
}
