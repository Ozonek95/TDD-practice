package com.mainpackage;


import java.util.HashMap;
import java.util.Map;

public class WordsCounter {
    private Map<String, Integer> valuesMap = new HashMap<String, Integer>();

    public int howManyTimesWordWasGiven(String input) throws Exception {
        if(input.contains(" ")){
            throw new Exception("No space allowed");
        }
        if (!valuesMap.containsKey(input)) {
            return 0;
        } else {
            return valuesMap.get(input);
        }
    }

    public void addWord(String input) {
        if(input.equals("")){
            return;
        }
        String[] words = input.split(" ");
        for (String s : words) {
            if (valuesMap.containsKey(s)) {
                valuesMap.put(s, valuesMap.get(s) + 1);
            } else {
                valuesMap.put(s, 1);
            }
        }

    }
}
