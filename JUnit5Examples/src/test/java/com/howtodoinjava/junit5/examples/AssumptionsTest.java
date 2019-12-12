package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest 
{
	@Test
    void testOnDev()
    {
        // 1- set dev env
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AssumptionsTest::message);
    }
      
    @Test
    void testOnProd()
    {
        // 2- set prod env
        // 3- test it with assumption
    }
      
    private static String message () {
        return "TEST Execution Failed :: ";
    }
}
