package com.codurance.social_network;

import com.codurance.social_network.commands.CommandFactory;
import com.codurance.social_network.commands.PostCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandFactoryShould {

  @Mock
  private UserRepository userRepository;

  @Test
  void return_post_command() {
    CommandFactory commandFactory = new CommandFactory(userRepository);
    String[] parserOutput = {"Alice", "->", "I love the weather today"};

    assertEquals(PostCommand.class, commandFactory.dispatch(parserOutput).getClass());
  }
}
