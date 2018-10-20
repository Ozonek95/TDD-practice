package com.mainpackage;


public class WordsCounter {
    String storedString = "";
    private int counter = 0;
    public int howManyTimesWordWasGiven(String input) {
        if(input.equals(storedString)){
            return counter;
        }
        return 0;
    }

    public void addWord(String input) {
        if(counter==0){
            storedString=input;
        }
        counter++;
    }
}
