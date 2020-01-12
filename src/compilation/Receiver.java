package compilation;

import commands.*;

import java.util.HashMap;

public class Receiver {
    public static final HashMap<Character, Command> chars2Commands = new HashMap<>();
    private InputHandler inputHandler;
    private Stack stack;

    public Receiver(Stack stack, InputHandler inputHandler) {
        this.stack = stack;
        this.inputHandler = inputHandler;
    }

    static {
        chars2Commands.put('+', new Increment());
        chars2Commands.put('-', new Decrement());
        chars2Commands.put('>', new NextCell());
        chars2Commands.put('<', new PreviousCell());
        chars2Commands.put('.', new PrintCurrentValue());
        chars2Commands.put('[', new StartLoop());
        chars2Commands.put(']', new StopLoop());
    }

    public Command getOperation(char operator) {
        return chars2Commands.get(operator);
    }

    public void executeOperation(Command command) {
        command.execute(stack, inputHandler);
    }

}
