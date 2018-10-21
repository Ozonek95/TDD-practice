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
    public void checkIfWordCounterReturnZero() throws Exception {
        int result = wordsCounter.howManyTimesWordWasGiven("Kot");

        Assert.assertEquals(0, result);
    }

    @Test
    public void checkIfOneUseOfAddWordMethodReturnsOne() throws Exception {

        wordsCounter.addWord("Kot");

        int result = wordsCounter.howManyTimesWordWasGiven("Kot");

        Assert.assertEquals(1, result);
    }

    @Test
    public void checkIfTwoDifferentWordsReturnZero() throws Exception {

        wordsCounter.addWord("Mama");

        int result = wordsCounter.howManyTimesWordWasGiven("Kot");

        Assert.assertEquals(0, result);

    }

    @Test
    public void checkIfTwoTimesAddedWordReturnsTwo() throws Exception {

        wordsCounter.addWord("Mama");
        wordsCounter.addWord("Mama");

        int result = wordsCounter.howManyTimesWordWasGiven("Mama");

        Assert.assertEquals(2, result);
    }

    @Test

    public void checkIfAddingWordThreeTimesAndTwoAreSameReturnTwo() throws Exception {
        wordsCounter.addWord("Mama");
        wordsCounter.addWord("Mama");
        wordsCounter.addWord("Mama2");

        int result = wordsCounter.howManyTimesWordWasGiven("Mama");

        Assert.assertEquals(2, result);

    }

    @Test

    public void checkIfInputWithSpaceGenerateTwoWords() throws Exception {
        wordsCounter.addWord("Mama ma kota");
        wordsCounter.addWord("Mama");
        wordsCounter.addWord("Mama2");

        int result = wordsCounter.howManyTimesWordWasGiven("kota");

        Assert.assertEquals(1, result);

    }

    @Test
    public void checkIfEmptyStringReturnZero() throws Exception {
        wordsCounter.addWord("");

            int result = wordsCounter.howManyTimesWordWasGiven("");

            Assert.assertEquals(0, result);


    }

    @Test
    public void checkIfSpaceInReturnNumberOfWordsMethodThrowException() {

        try {
            wordsCounter.howManyTimesWordWasGiven("kac ad");


            Assert.fail("Exception wasnt thrown");

        } catch (Exception e) {
            Assert.assertEquals("No space allowed", e.getMessage());
        }
    }

}
