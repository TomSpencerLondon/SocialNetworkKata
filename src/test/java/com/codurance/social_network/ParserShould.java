package com.codurance.social_network;

import com.codurance.social_network.Parser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ParserShould {

  @Test
  void return_username_action_and_argument() {
    Parser parser = new Parser();
    String[] expectedArray = {"Alice", "->", "I love the weather today"};
    String input = "Alice -> I love the weather today";
    assertArrayEquals(expectedArray, parser.parse(input));
  }
}
