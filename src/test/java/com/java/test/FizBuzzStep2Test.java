package com.java.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by nikhi on 05/07/2017.
 */

@RunWith(Parameterized.class)
public class FizBuzzStep2Test extends BaseTest {

    private FizBuzzStep2 fizBuzzStep;

    public FizBuzzStep2Test(int from,int to,String expectedMessage) {
        super(from, to, expectedMessage);
    }

    @Before
    public void setup() {
        fizBuzzStep = new FizBuzzStep2();
    }

    @Parameterized.Parameters(name = "Number range from-{0} to-{1}")
    public static Collection<Object[]> getNumberRange() {
        Object[][] inputAndOutput = {{3, 10, "luck 4 buzz fizz 7 8 fizz buzz"}, {1, 20, "1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz"}};
        return Arrays.asList(inputAndOutput);
    }
    @Test
    public void should_return_correct_fizz_buzz_message(){
        String actualMessage = fizBuzzStep.getFizzBuzz(from,to);
        assertEquals(expectedMessage,actualMessage.trim());
    }
}
