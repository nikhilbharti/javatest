package com.java.test;

import java.util.Arrays;
import java.util.function.Predicate;


/**
 * Created by nikhi on 05/07/2017.
 */
public class Utility {
    public static String separator = " ";
    public static boolean isDivisibleBy3(int n) {
        return n % 3 == 0;
    }

    public static boolean isDivisibleBy5(int n) {
        return n % 5 == 0;
    }

    public static boolean isDivisibleBy3And5(int n) {
        return n % 15 == 0;
    }

    public static boolean digitContains3(int n) {
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit == 3) return true;
            else n = n / 10;
        }
        return false;
    }



}
