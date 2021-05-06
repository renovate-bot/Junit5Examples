package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

// Je veux sélectionné le package principale
@SelectPackages("my.package")
public class ExpectedExceptionTest {
    @Test
    void testExpectedException() {
        // 1- assert throw this exception : NumberFormatException
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });

    }

    @Test
    void testExpectedExceptionWithSameType() {
        // 2- assert throw this exception : IllegalArgumentException
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("One");
        });
    }

}
