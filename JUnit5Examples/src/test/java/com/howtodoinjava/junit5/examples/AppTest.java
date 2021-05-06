package com.howtodoinjava.junit5.examples;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AppTest {

    // 1- exécuter avant tous
    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll executed");
    }

    // 2- exe avant chacun
    @BeforeEach
    void setupThis() {
        System.out.println("@BeforeEach executed");
    }

    // 3- c'est un test de DEV
    @Tag("DEV")
    @Test
    void testCalcOne() {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals(4, Calculator.add(2, 2));
    }

    // 4- c'est un test de prod
    @Tag("PROD")
    // 6- ignorer ce test
    @Ignore
    @Test
    void testCalcTwo() {
        System.out.println("======TEST TWO EXECUTED=======");

        // 5- tester l'addition de 4  et 2
        Assertions.assertEquals(6, Calculator.add(2, 4));
    }

    // 7- exe après chacun
    @AfterEach
    void tearThis() {
        System.out.println("@AfterEach executed");
    }

    // 8- exex après tous
    @AfterAll
    static void tear() {
        System.out.println("@AfterAll executed");
    }
}
