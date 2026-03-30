package edu.kis.vh.nursery;

/**
 * Klasa bazowa - wyliczanka, zarządzanie tablicą elementów (np. dodawanie, usuwanie)
 */
public class defaultCountingOutRhymer {

    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int MAX_CAPACITY = 12;
    public static final int DEFAULT_VALUE = -1;
    public static final int STACK_FULL_INDICATOR = MAX_CAPACITY - 1;

    private final int[] numbers = new int[MAX_CAPACITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    public int getTotal(){
        return total;
    }

    /**
     * Dodaje nowa wartosc do wyliczanki
     * @param in - wartosc, ktora ma zostac dodana
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == STACK_FULL_INDICATOR;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    /**
     * Zwraca i usuwa ostatnio dodany element
     * @return - ostatnio dodana wartosc lub wskaznik bledu (gdy wyliczanka pusta)
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}
