package com.example.demoeventsandaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableAsync
public class DemoEventsAndAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEventsAndAopApplication.class, args);
	}
}

@Component
class Initializer implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(Initializer.class);

    private final UserService userService;

    public Initializer(UserService userService) {git init
        this.userService = userService;
    }

    @Override
    public void run(String... args) {
        User vnd = userService.createUser(new UserInfo("vnd", "vnd@mail.com"));

        LOG.info("Created user {}", vnd.getId());
    }
}
