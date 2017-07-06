package com.java.test;

import java.util.stream.IntStream;

import static com.java.test.Utility.*;


public class FizBuzzStep1 {
    private String separator = " ";

    public String getFizzBuzz(int fromRange, int toRange) {
        StringBuilder output = new StringBuilder();
        IntStream.rangeClosed(fromRange, toRange).forEach(
                n -> {
                    if (isDivisibleBy3And5(n))
                        output.append("fizzbuzz").append(separator);
                    else if (isDivisibleBy3(n))
                        output.append("fizz").append(separator);
                    else if (isDivisibleBy5(n))
                        output.append("buzz").append(separator);
                    else
                        output.append(n).append(separator);
                }
        );
        output.setLength(output.length() - 1);
        return output.toString();
    }
}
