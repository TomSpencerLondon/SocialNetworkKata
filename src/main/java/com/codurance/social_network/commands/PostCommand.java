package com.codurance.social_network.commands;

import com.codurance.social_network.User;
import com.codurance.social_network.UserRepository;

public class PostCommand implements Command {
    private final String username;
    private final String message;
    private final UserRepository userRepository;

    public PostCommand(String username, String message, UserRepository userRepository) {
        this.username = username;
        this.message = message;
        this.userRepository = userRepository;
    }

    public void execute(){
        User user = userRepository.getUserBy(username);
        user.storeMessage(message);
    }
}
