package com.kolmikra.utils;

import java.util.Random;

public class StringUtil {
    //Exercise 8;
    public static void printAllNonEmptySubStrings(String inputString) {
        for (String str : inputString.split(("\\s+"))) {
            System.out.println(str);
        }
    }

    //Exercise 9;
    public static boolean stringCompare(String firstStr, String secondStr) {
        return firstStr.compareTo(secondStr) == 0;
    }

    //Exercise 10;
    public static String longToStringRx36(Long value) {
        return Long.toString(value, 36);
    }
}
