package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class BeforeAllTest {


    // 3- nommer le test

    // 1- Répéter 3 fois
    void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
    }

    // 2- method before all show message
    public static void init() {
        System.out.println("okayyy");
    }

}
