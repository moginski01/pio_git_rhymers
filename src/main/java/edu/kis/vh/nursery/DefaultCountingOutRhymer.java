package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int SIZE = 12;
    private static final int START_VAL = -1;
    private final int[] numbers = new int[SIZE];

    private int total = START_VAL;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == START_VAL;
    }

    public boolean isFull() {
        return total == SIZE+START_VAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
