public class CommandRepository {

    private final Parser parser;
    private final CommandFactory commandFactory;

    public CommandRepository(Parser parser, CommandFactory commandFactory) {
        this.parser = parser;
        this.commandFactory = commandFactory;
    }

    public Command getCommand(String input) {
        String[] parsedInput = parser.parse(input);
        return commandFactory.dispatch(parsedInput);
    }
}
