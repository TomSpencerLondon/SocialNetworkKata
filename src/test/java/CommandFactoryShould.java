import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandFactoryShould {

  @Test
  void return_post_command() {
    CommandFactory commandFactory = new CommandFactory();
    String[] parserOutput = {"Alice", "->", "I love the weather today"};

    assertEquals(PostCommand.class, commandFactory.dispatch(parserOutput).getClass());
  }
}
