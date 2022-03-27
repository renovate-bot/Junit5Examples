package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class BeforeEachTest {

    @DisplayName("Add operation test")
    // Répéter 3 fois
    void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
    }

    // 1- method before each show message
    public static void initEach() {
        System.out.println("okay");

    }


}