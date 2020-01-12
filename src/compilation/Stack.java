package compilation;

public class Stack { //memory

    private byte[] stack = new byte[30000];
    private int stackPointer = 0;

    public byte[] getStack() {
        return stack;
    }

    public void setStack(byte[] stack) {
        this.stack = stack;
    }

    public int getStackPointer() {
        return stackPointer;
    }

    public void setStackPointer(int stackPointer) {
        this.stackPointer = stackPointer;

    }

    public int getCurrentStackElement() {

        return stack[stackPointer];

    }

    public void setCurrentStackElement(byte newValue) {
        stack[stackPointer] = newValue;
    }

}
