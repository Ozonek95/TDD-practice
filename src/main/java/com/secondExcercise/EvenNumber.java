package com.secondExcercise;

public class EvenNumber {
    private final int number;
    public EvenNumber(int number) {
        this.number = number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }
}
