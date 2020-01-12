package commands;

import compilation.InputHandler;
import compilation.Stack;

public class Increment implements Command {

    @Override
    public void execute(Stack stack, InputHandler i) {
        stack.setCurrentStackElement((byte) (stack.getCurrentStackElement() + 1));
    }
}
