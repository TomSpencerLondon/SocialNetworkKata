package com.codurance.social_network;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public User findOrCreateUserBy(String username) {
        return users.getOrDefault(username, new User(username));
    }

    public void save(User user) {
        users.put(user.username, user);
    }
}
