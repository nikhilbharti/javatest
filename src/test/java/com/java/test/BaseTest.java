package com.java.test;

/**
 * Created by nikhi on 05/07/2017.
 */
public class BaseTest {
    protected int from;
    protected int to;
    protected String expectedMessage;

    public BaseTest(int from, int to,String expectedMessage) {
        this.from = from;
        this.to = to;
        this.expectedMessage = expectedMessage;
    }
}
