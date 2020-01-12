package commands;

import compilation.InputHandler;
import compilation.Stack;

public class PrintCurrentValue implements Command {


    @Override
    public void execute(Stack stack, InputHandler i) {
        System.out.print((char) stack.getCurrentStackElement());
    }

}
