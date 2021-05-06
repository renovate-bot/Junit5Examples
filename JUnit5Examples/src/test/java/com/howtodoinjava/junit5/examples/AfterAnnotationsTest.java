package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AfterAnnotationsTest {

	// 1- test title
	@DisplayName("operation")
	// 2- repeat test 5 times
	@RepeatedTest(5)
	@Test
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo)
	{
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
	}
	
	// 3-do it after all
	@AfterAll
	public static void cleanUp(){
		System.out.println("After All cleanUp() method called");
	}
	
	// 4-do it after each
	@AfterEach
	public void cleanUpEach(){
		System.out.println("After Each cleanUpEach() method called");
	}

}
