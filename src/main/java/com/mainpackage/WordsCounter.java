package com.mainpackage;

import java.util.HashMap;
import java.util.Map;

public class WordsCounter {
    private Map<String, Integer> valuesMap = new HashMap<>();

    public int howManyTimesWordWasGiven(String input) throws Exception {
        checkIfCorrect(input);

        return valuesMap.getOrDefault(input, 0);
//        if (!valuesMap.containsKey(input)) {
//            return 0;
//        } else {
//            return valuesMap.get(input);
//        }
        //ROBI TO SAMO!!
    }


    public void addWord(String input) {
        if (input.equals("")) {
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

    private void checkIfCorrect(String input) throws Exception {
        if (input.contains(" ")) {
            throw new Exception("No space allowed");
        }
    }
}
