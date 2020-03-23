package com.kolmikra.utils;

import java.util.Scanner;

public class NumberUtil {
    //Exercise 1;
    public static void outInDiffFormat(int value) {
        System.out.printf("Hex - %1$#x\nOct - %1$#o\n", value);
        System.out.println("Binary - " + Integer.toBinaryString(value));
        System.out.printf("Reciprocal in Hex fl-p - %a", 1.0 / value);
    }

    //Exercise 2;
    public static int normalizesAngle(int value) {
        return (value % 360 + 360) % 360;
    }
    public static int normalizesAngleMath(int value) {
        return Math.floorMod(value,360);
    }
    //Exercise 3;
    public static int maxValue(int val1, int val2, int val3) {
        if (val1 > val2 && val1 > val3) {
            return val1;
        } else if (val2 > val3) {
            return val2;
        }
        return val3;
    }

    public static int maxValueMath(int val1, int val2, int val3) {
        return Math.max(val1, Math.max(val2, val3));
    }

    //Exercise 4;
    public static void outDoubleMax() {
        System.out.println(Math.nextUp(Double.MAX_VALUE));
    }

    public static void outDoubleMin() {
        System.out.println(Math.nextUp(Double.MIN_VALUE));
    }

    //Exercise 5;
    public static void downCastExample() {
        double bigValue = 3000000000d;
        System.out.println("double val =  " + bigValue + ", (int)double val = " + (int) bigValue);
    }

    //Exercise 7;
    public static void unsignedIntCalc() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int value1 = (int) in.nextLong();
        System.out.println("Введите второе число: ");
        int value2 = (int) in.nextLong();
        System.out.println("Первое число = " + Integer.toUnsignedLong(value1));
        System.out.println("Второе число = " + Integer.toUnsignedLong(value2));
        System.out.println("Сумма = " + (Integer.toUnsignedLong(value1) + Integer.toUnsignedLong(value2)));
        System.out.println("Разность = " + (Integer.toUnsignedLong(value1) - Integer.toUnsignedLong(value2)));
        System.out.println("Произведение = " + (Integer.toUnsignedLong(value1) * Integer.toUnsignedLong(value2)));
        System.out.println("Частное = " + (Integer.toUnsignedLong(value1) / Integer.toUnsignedLong(value2)));
        System.out.println("Остаток = " + (Integer.toUnsignedLong(value1) % Integer.toUnsignedLong(value2)));
    }
}
