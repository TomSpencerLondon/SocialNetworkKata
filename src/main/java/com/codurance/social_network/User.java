package com.codurance.social_network;

public class User {
    public final String username;

    public User(String username) {
        this.username = username;
    }

    public void storeMessage(String message) {
        throw new UnsupportedOperationException();
    }
}
