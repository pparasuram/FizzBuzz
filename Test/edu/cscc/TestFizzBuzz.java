package edu.cscc;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestFizzBuzz {
    FizzBuzz fizzBuzzTest;
    @BeforeClass
    public static void beforeClassTest(){
        System.out.println("Before Class");
    }
    @Before
    public void beforeTest(){
        fizzBuzzTest = new FizzBuzz(4);
        System.out.println("Before");
    }
    @After
    public void afterTest(){
        System.out.println("After");
    }
    @AfterClass
    public static void afterClassTest(){
        System.out.println("AfterClass");
    }

    @Test
    public void givenNumberTestFizzBuzz() {
        // FizzBuzz fizzBuzzTest = new FizzBuzz(102);
        assertEquals("fizz", fizzBuzzTest.doFizzBuzz());
        assertNull(new FizzBuzzNew());
        // added a comment
        // one more
    }
}
