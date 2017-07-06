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
public class FizBuzzStep3Test extends BaseTest{

    private FizBuzzStep3 fizBuzzStep;
    public FizBuzzStep3Test(int from, int to, String expectedMessage ) {
        super(from, to, expectedMessage);
    }

    @Before
    public void setup() {
        fizBuzzStep = new FizBuzzStep3();
    }

    @Parameterized.Parameters(name = "Number range from-{0} to-{1}")
    public static Collection<Object[]> getNumberRange() {

        String message1 =  "luck 4 buzz fizz 7 8 fizz buzz"
                +"\n"+ "fizz: 2" + "\n" + "buzz: 2";
        message1 = message1 + "\n" + "fizzbuzz: 0";
        message1 = message1 + "\n" + "luck: 1";
        message1 = message1 + "\n" + "number: 3";

        String message2 = "1 2 luck 4 buzz fizz 7 8 fizz buzz 11 fizz luck 14 fizzbuzz 16 17 fizz 19 buzz"
                +"\n"+ "fizz: 4" + "\n" + "buzz: 3";
        message2 = message2 + "\n" + "fizzbuzz: 1";
        message2 = message2 + "\n" + "luck: 2";
        message2 = message2 + "\n" + "number: 10";

        Object[][] inputAndOutput = {{3, 10, message1}, {1, 20, message2}};
        return Arrays.asList(inputAndOutput);
    }
    @Test
    public void should_return_correct_fizz_buzz_message(){
        String actualMessage = fizBuzzStep.getFizzBuzz(from,to);
        assertEquals(expectedMessage,actualMessage);
    }
}
