package com.example.demoeventsandaop;

import java.util.UUID;

public class UserInfo {

    private String username;
    private String email;

    public UserInfo(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public User toUser() {
        return new User(UUID.randomUUID().toString(), username, email);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
