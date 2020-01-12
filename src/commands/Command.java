package commands;
import compilation.InputHandler;
import compilation.Stack;
public interface Command {
    void execute(Stack s, InputHandler i);
}
