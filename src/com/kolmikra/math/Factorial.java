package com.kolmikra.math;

import java.math.BigInteger;

public class Factorial {
    //Exercise 6;
    public static BigInteger calcFactorial(int value) {
        if (value == 0) return BigInteger.ONE;
        return calcFactorial(value - 1).multiply(BigInteger.valueOf(value));
    }
}
