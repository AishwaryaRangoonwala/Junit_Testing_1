package com.aishwarya;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
// @DisplayNameGeneration(DisplayNameGenerator.Standard.class)
// @DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeAll
    static void setUpBeforeEachClass() {
        System.out.println("@BeforeAll executes only once before execution of all the test methods in the class");
        System.out.println();
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll executes only once after all the test methods in the class");
    }

    @BeforeEach
    void setUpBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the excecution of each test method");
    }

    @AfterEach
    void TearDownAfterEach() {
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @Test
    @DisplayName("Equals and Not Equals")
    void testEqualsAnsNotEquals() {
        System.out.println("Running test: testEqualsAnsNotEquals");
        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1,9), "1+9 must not be 6");
    }

    @Test
    @DisplayName("Null and Not Null")
    void testNullAndNotNull() {
        System.out.println("Running test: testNullAndNotNull");
        String str1 = null;
        String str2 = "luv2code";
        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");

    }
}