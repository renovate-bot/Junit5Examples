package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AfterAnnotationsTest {

    // 1- test title
    // 2- repeat test 5 times
    @Test
    void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
    }

    // 3-do it after all
    public static void cleanUp() {
        System.out.println("After All cleanUp() method called");
    }

    // 4-do it after each
    public void cleanUpEach() {
        System.out.println("After Each cleanUpEach() method called");
    }

}
