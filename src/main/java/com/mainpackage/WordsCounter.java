package com.mainpackage;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsCounter {
    Map<String, Integer> valuesMap = new HashMap<String, Integer>();

    public int howManyTimesWordWasGiven(String input) {
        if(!valuesMap.containsKey(input)){
            return 0;
        }
        else {
            return valuesMap.get(input);
        }
    }

    public void addWord(String input) {
        if (valuesMap.containsKey(input)) {
            valuesMap.put(input, valuesMap.get(input) + 1);
        } else {
            valuesMap.put(input, 1);
        }
    }
}
