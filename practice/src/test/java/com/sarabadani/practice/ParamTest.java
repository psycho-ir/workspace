package com.sarabadani.practice;


import org.junit.Test;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.Arrays;

import static org.junit.Assert.assertThat;

/**
 * Created by soroosh on 11/29/14.
 */
@RunWith(Parameterized.class)
public class ParamTest {

    @Parameterized.Parameters(name = "{index}: fib({0})={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 5}
        });
    }
    @Parameterized.Parameters(name = "{index}: fib({0})={1}")
    public static Iterable<Object[]> dat() {
        return Arrays.asList(new Object[][]{
                {0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 6}
        });
    }

    private int input;
    private int expected;

    public ParamTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void testWithParam() {


    }


}
