package com.codurance.social_network.commands;

import com.codurance.social_network.UserRepository;

public class PostCommand implements Command {
    public PostCommand(String username, String message, UserRepository userRepository) {

    }

    public void execute(){
        throw new UnsupportedOperationException("NOOOOOO!!!");
    }
}
