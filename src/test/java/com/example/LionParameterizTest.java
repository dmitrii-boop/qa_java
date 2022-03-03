package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class LionParameterizTest {

    Feline feline = new Feline();
    private final String sex;
    private final boolean expected;

    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    public LionParameterizTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Test
    public void createLionMaleTest() throws Exception {
        Lion lion = new Lion (sex, feline);
        assertEquals(expected, lion.doesHaveMane());
    }
}
