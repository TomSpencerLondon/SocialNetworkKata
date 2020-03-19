package com.codurance.social_network.commands;

import com.codurance.social_network.UserRepository;

public class CommandFactory {
  private UserRepository userRepository;

  public CommandFactory(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Command dispatch(String[] input) {
    if (input[1].equals("->")){
      return new PostCommand(input[0], input[2], userRepository);
    }
    throw new UnsupportedOperationException();
  }
}
