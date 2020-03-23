package com.kolmikra;

import com.kolmikra.lottery.Lottery;
import com.kolmikra.math.Factorial;
import com.kolmikra.math.MagicSquare;
import com.kolmikra.utils.NumberUtil;
import com.kolmikra.utils.StringUtil;

import java.util.*;

public class Tests {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        NumberUtil.outInDiffFormat(value);

        System.out.println("\n" + NumberUtil.normalizesAngle(value));
        System.out.println("\n" + NumberUtil.normalizesAngleMath(value));

        System.out.println("Введите 3 числа:");
        int val1 = in.nextInt();
        int val2 = in.nextInt();
        int val3 = in.nextInt();
        System.out.println("MaxVal - " + NumberUtil.maxValue(val1, val2, val3));
        System.out.println("MathMaxVal - " + NumberUtil.maxValueMath(val1, val2, val3));

        NumberUtil.outDoubleMax();
        NumberUtil.outDoubleMin();

        NumberUtil.downCastExample();

        System.out.println(Factorial.calcFactorial(1000));

        NumberUtil.unsignedIntCalc();

        System.out.println("Введите строку: ");
        String newStr = in.nextLine();
        StringUtil.printAllNonEmptySubStrings(newStr);

        System.out.println(StringUtil.stringCompare("qwerty", "qwerty"));

        StringUtil.longToStringRx36(new Random().nextLong());

        Lottery lottery = new Lottery();
        System.out.println(lottery.getWinningCombs());
        System.out.println(lottery.getAllList());
        lottery.removeItems();
        System.out.println(lottery.getSortedLotteryList());

        MagicSquare square = new MagicSquare();
        System.out.println(MagicSquare.isMagicSquare(square.getSquare()));
    }
}
