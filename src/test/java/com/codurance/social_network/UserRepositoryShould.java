package com.codurance.social_network;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserRepositoryShould {

    public static final String ANY_USER = "Alice";

    @Test
    void create_a_user_if_does_not_exist() {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.findOrCreateUserBy(ANY_USER);
        assertEquals(ANY_USER, user.username);
    }

    @Test
    void save_user() {
        UserRepository userRepository = new UserRepository();
        User user = new User(ANY_USER);
        userRepository.save(user);
        assertEquals(user, userRepository.findOrCreateUserBy(ANY_USER));
    }

    @Test
    void find_or_create_same_user_once_saved() {
        UserRepository userRepository = new UserRepository();
        User user = userRepository.findOrCreateUserBy(ANY_USER);
        userRepository.save(user);
        assertEquals(user, userRepository.findOrCreateUserBy(ANY_USER));
    }
}