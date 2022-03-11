package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterizTest {

    private final int expected;

    public FelineParameterizTest(int expected) {
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {1},
                {0},
                {-1},
        };
    }

    @Test
    public void testGetKittensWithArgument() {
        Feline feline = new Feline();
        int actual = feline.getKittens(expected);
        Assert.assertEquals(expected, actual);
    }
}


