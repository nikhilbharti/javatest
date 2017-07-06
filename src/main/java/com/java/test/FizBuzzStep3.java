package com.java.test;

import static com.java.test.Utility.*;

public class FizBuzzStep3 {
    private String separator = " ";

    public String getFizzBuzz(int from, int to) {
        return generateMessage(from, to, 0, 0, 0, 0, 0, new StringBuilder());
    }

    private String generateMessage(int from, int to, int luckCount, int fizzCount, int buzzCount, int fizzBuzzCount, int numberCount, StringBuilder out) {
        if (from > to) {
            out.setLength(out.length() - 1);
            appendStats(luckCount, fizzCount, buzzCount, fizzBuzzCount, numberCount, out);
            return out.toString();
        } else {
            if (digitContains3(from)) {
                out.append("luck").append(separator);
                luckCount++;
            } else if (isDivisibleBy3And5(from)) {
                out.append("fizzbuzz").append(separator);
                fizzBuzzCount++;
            } else if (isDivisibleBy3(from)) {
                out.append("fizz").append(separator);
                fizzCount++;
            } else if (isDivisibleBy5(from)) {
                out.append("buzz").append(separator);
                buzzCount++;
            } else {
                out.append(from).append(separator);
                numberCount++;
            }

            return generateMessage(from + 1, to, luckCount, fizzCount, buzzCount, fizzBuzzCount, numberCount, out);
        }
    }

    private void appendStats(int luckCount, int fizzCount, int buzzCount, int fizzBuzzCount, int numberCount, StringBuilder out) {
        out.append("\n");
        out.append("fizz: ").append(fizzCount);
        out.append("\n");
        out.append("buzz: ").append(buzzCount);
        out.append("\n");
        out.append("fizzbuzz: ").append(fizzBuzzCount);
        out.append("\n");
        out.append("luck: ").append(luckCount);
        out.append("\n");
        out.append("number: ").append(numberCount);
    }
}
