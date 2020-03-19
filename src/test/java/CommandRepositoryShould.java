import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CommandRepositoryShould {
  @Mock
  Parser parser;

  @Mock
  CommandFactory commandFactory;

  @Mock
  PostCommand postCommand;

  private CommandRepository commandRepository;

  @BeforeEach
  void setUp() {
    commandRepository = new CommandRepository(parser, commandFactory);
  }

  @Test
  void return_post_command() {
    String input = "Alice -> I love the weather today";
    String[] parserOutput = {"Alice", "->", "I love the weather today"};
    when(parser.parse(input)).thenReturn(parserOutput);
    when(commandFactory.dispatch(parserOutput)).thenReturn(postCommand);

    Command command = commandRepository.getCommand(input);

    verify(commandFactory).dispatch(parserOutput);
    assertEquals(postCommand, command);
  }
}
