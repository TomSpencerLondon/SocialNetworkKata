public class CommandFactory {
  public Command dispatch(String[] input) {
    if (input[1].equals("->")){
      return new PostCommand();
    }
    throw new UnsupportedOperationException();
  }
}
