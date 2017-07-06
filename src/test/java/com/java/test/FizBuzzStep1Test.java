package com.java.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FizBuzzStep1Test extends BaseTest {

    private FizBuzzStep1 fizBuzz;

    public FizBuzzStep1Test(int from,int to, String expectedMessage) {
        super(from, to, expectedMessage);
    }

    @Before
    public void setup() {
        fizBuzz = new FizBuzzStep1();
    }

    @Parameterized.Parameters(name = "Number range from-{0} to-{1}")
    public static Collection<Object[]> getNumberRange() {
        Object[][] inputAndOutput = {{3, 5, "fizz 4 buzz"}, {1, 20, "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"}};
        return Arrays.asList(inputAndOutput);
    }

    @Test
    public void should_return_correct_fizz_buzz_message(){
        String actualMessage = fizBuzz.getFizzBuzz(from, to);
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
