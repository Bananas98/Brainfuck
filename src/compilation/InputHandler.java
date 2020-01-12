package compilation;

import java.util.Scanner;

public class InputHandler {
    private char[] bfProgram;
    private int indexArray = 0;
    private int loopStepCounter = 0;


    public char[] getBfProgram() {
        return bfProgram;
    }

    public int getLoopStepCounter() {
        return loopStepCounter;
    }

    public void setLoopStepCounter(int loopStepCounter) {
        this.loopStepCounter = loopStepCounter;
    }

    public int getIndexArray() {
        return indexArray;
    }

    public char getCurrentValue() {
        return bfProgram[indexArray];
    }

    public void setIndexArray(int indexArray) {
        this.indexArray = indexArray;
    }

    public InputHandler() {
        System.out.println("enter brainfuck code");
        bfProgram = input();
    }

    public char[] input() {
        Scanner scanner = new Scanner(System.in);
        String bfProgram = scanner.nextLine();
        return bfProgram.toCharArray();
    }
}
