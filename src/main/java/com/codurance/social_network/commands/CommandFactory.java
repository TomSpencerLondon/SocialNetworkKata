package com.codurance.social_network.commands;

import com.codurance.social_network.commands.Command;
import com.codurance.social_network.commands.PostCommand;

public class CommandFactory {
  public Command dispatch(String[] input) {
    if (input[1].equals("->")){
      return new PostCommand();
    }
    throw new UnsupportedOperationException();
  }
}
