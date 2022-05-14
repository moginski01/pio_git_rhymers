package edu.kis.vh.nursery;

/**
 *klasa główna - stos
 * zawiera tablice na dane, metody zwracające ostatnie wartości i sprawdzające stan tablicy - pusta/pelna
 */
public class DefaultCountingOutRhymer {
    private static final int SIZE = 12;
    private static final int START_VAL = -1;
    private final int[] numbers = new int[SIZE];

    private int total = START_VAL;

    /**
     * Metoda zwraca licznik na ile jest ustawiony
     * @return
     */
    public int getTotal() {
        return total;
    }

    /**
     * Metoda dodaje liczbe do tablicy
     * Zwiększa atrybut total o jeden
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Metoda sprawdza czy tablica jest pusta
     * @return
     */
    public boolean callCheck() {
        return total == START_VAL;
    }

    /**
     * Metoda sprawdza czy tablica jest pełna
     * @return
     */
    public boolean isFull() {
        return total == SIZE+START_VAL;
    }

    /**
     * Metoda zwraca ostatnią wartość z tablicy
     * @return
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    /**
     * Metoda zwraca ostatnią wartość z tablicy i zmniejsza ją o jeden
     * @return
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
