package com.java.test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.java.test.Utility.*;

public class FizBuzzStep3 {

    public String getFizzBuzz(int from, int to) {

        //return generateMessage(from, to, 0, 0, 0, 0, 0, new StringBuilder());
        StringBuilder builder = new StringBuilder();
        getFizzBuzz2(from, to, builder);
        String message = builder.toString();
        long luckCount = countWord(message, "luck");
        long fizzCount = countWord(message, "fizz");
        long fizzBuzzCount = countWord(message,"fizzbuzz");
        long buzzCount = countWord(message, "buzz");
        long numberCount = Arrays.stream(message.split(separator)).filter(isNumber).count();
        appendStats(luckCount,fizzCount,buzzCount, fizzBuzzCount, numberCount, builder);
        return builder.toString();
    }

    /*private String generateMessage(int from, int to, int luckCount, int fizzCount, int buzzCount, int fizzBuzzCount, int numberCount, StringBuilder out) {
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
    }*/

    public String getFizzBuzz2(int fromRange, int toRange, StringBuilder output) {
        IntStream.rangeClosed(fromRange, toRange).forEach(
                n -> {
                    if (digitContains3(n))
                        output.append("luck").append(separator);
                    else if (isDivisibleBy3And5(n))
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

    private long countWord(String message, String key) {
        return Arrays.stream(message.split(separator)).filter((s) -> s.equals(key)).count();
    }

    private Predicate<String> isNumber = (message) -> message.matches("[-+]?\\d*\\.?\\d+");

    private void appendStats(long luckCount, long fizzCount, long buzzCount, long fizzBuzzCount, long numberCount,StringBuilder out) {
        out.append(System.lineSeparator());
        out.append("fizz: ").append(fizzCount);
        out.append(System.lineSeparator());
        out.append("buzz: ").append(buzzCount);
        out.append(System.lineSeparator());
        out.append("fizzbuzz: ").append(fizzBuzzCount);
        out.append(System.lineSeparator());
        out.append("luck: ").append(luckCount);
        out.append(System.lineSeparator());
        out.append("number: ").append(numberCount);
    }
}
