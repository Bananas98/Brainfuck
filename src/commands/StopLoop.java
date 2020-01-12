package commands;

import compilation.InputHandler;
import compilation.Stack;

public class StopLoop implements Command {

    @Override
    public void execute(Stack s, InputHandler i) {
        if (s.getCurrentStackElement() != 0) {
            i.setIndexArray(i.getIndexArray() - 1);
            while (i.getLoopStepCounter() > 0 || i.getCurrentValue() != '[') {
                if (i.getCurrentValue() == ']') {
                    i.setLoopStepCounter(i.getLoopStepCounter() + 1);
                } else if (i.getCurrentValue() == '[') {
                    i.setLoopStepCounter(i.getLoopStepCounter() - 1);
                }
                i.setIndexArray(i.getIndexArray() - 1);
            }
            i.setIndexArray(i.getIndexArray() - 1);
        }
    }
}
