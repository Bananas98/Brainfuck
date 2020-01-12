package commands;

import compilation.InputHandler;
import compilation.Stack;

public class PreviousCell implements Command {


    @Override
    public void execute(Stack stack, InputHandler i) {
        if (stack.getStackPointer() == 0)//If the pointer reaches zero
            // pointer is returned to rightmost memory position
            stack.setStackPointer(stack.getStack().length - 1);
        else
            stack.setStackPointer(stack.getStackPointer() - 1);
    }
}
