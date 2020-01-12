package runtime;

import compilation.InputHandler;
import compilation.Receiver;
import compilation.Stack;

public class Interpreter {

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        Stack stack = new Stack();
        Receiver receiver = new Receiver(stack, inputHandler);

        for (inputHandler.setIndexArray(0);
             inputHandler.getIndexArray() < inputHandler.getBfProgram().length;
             inputHandler.setIndexArray(inputHandler.getIndexArray() + 1)) {
             receiver.executeOperation(receiver.getOperation(inputHandler.getCurrentValue()));
        }
    }
}