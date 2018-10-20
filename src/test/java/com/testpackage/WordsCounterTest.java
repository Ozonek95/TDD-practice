package com.testpackage;


import com.mainpackage.WordsCounter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordsCounterTest {


    private WordsCounter wordsCounter;

    @Before
    public void setUp() {
        wordsCounter = new WordsCounter();
    }

    @Test
    public void checkIfWordCounterReturnZero() {
        int result = wordsCounter.howManyTimesWordWasGiven("Kot");

        Assert.assertEquals(0,result);
    }

    @Test
    public void checkIfOneUseOfAddWordMethodReturnsOne() {

        wordsCounter.addWord("Kot");

        int result = wordsCounter.howManyTimesWordWasGiven("Kot");

        Assert.assertEquals(1,result);
    }

    @Test
    public void checkIfTwoDifferentWordsReturnZero() {

        wordsCounter.addWord("Mama");

        int result = wordsCounter.howManyTimesWordWasGiven("Kot");

        Assert.assertEquals(0,result);

    }

    @Test
    public void checkIfTwoTimesAddedWordReturnsTwo() {

        wordsCounter.addWord("Mama");
        wordsCounter.addWord("Mama");

        int result = wordsCounter.howManyTimesWordWasGiven("Mama");

        Assert.assertEquals(2,result);
    }

    @Test

    public void checkIfAddingWordThreeTimesAndTwoAreSameReturnTwo(){
        wordsCounter.addWord("Mama");
        wordsCounter.addWord("Mama");
        wordsCounter.addWord("Mama2");

        int result = wordsCounter.howManyTimesWordWasGiven("Mama");

        Assert.assertEquals(2,result);

    }
}
