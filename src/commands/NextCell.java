
package commands;

import compilation.InputHandler;
import compilation.Stack;

public class NextCell implements Command {


    @Override
    public void execute(Stack stack, InputHandler i) {
        if (stack.getStackPointer() == stack.getStack().length - 1)//if memory is full
            stack.setStackPointer(0);
        stack.setStackPointer(stack.getStackPointer() + 1);
    }
}
