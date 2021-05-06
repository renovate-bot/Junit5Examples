package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RepeatedInvocationsTest {

// 1- create double method to show message before all and before each

    @BeforeAll
    public static void init() {
        System.out.println("startAll");
    }

    @BeforeEach
    public static void initEach() {
        System.out.println("startEach");
    }

    // 2- test title
    @DisplayName("test")
    // 3- repeat it 5 times
    @RepeatedTest(5)
    void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running addNumber test -> " + repetitionInfo.getCurrentRepetition());
        // 4- create test with assertEquals
        Assertions.assertEquals(2, Calculator.add(1, 1), "1+1=2");
    }


    // 5- double clean method after all and after each
	@AfterAll
	public static void clean(){
		System.out.println("cleanAll");
	}

    @AfterEach
    public static void cleanEach(){
        System.out.println("cleanEach");
    }

}