package com.kolmikra.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicSquare {
    private int[][] square;

    public MagicSquare() {
        setSquare();
    }

    public void setSquare() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите квадрат: \n");
        List<String[]> strContainer = new ArrayList<>();
        while (true) {
            String nextLine = in.nextLine();
            if ("".equals(nextLine)) {
                break;
            }
            strContainer.add(nextLine.split("\\s+"));
        }
        if (!strContainer.isEmpty()) {
            int[][] square = new int[strContainer.size()][strContainer.get(0).length];
            for (int i = 0; i < strContainer.size(); i++) {
                for (int j = 0; j < strContainer.get(0).length; j++) {
                    square[i][j] = Integer.parseInt(strContainer.get(i)[j]);
                }
            }
            this.square = square;
        }
    }

    public int[][] getSquare() {
        return square;
    }

    public static boolean isMagicSquare(int[][] square) {
        if (square == null || square[0] == null) {
            return false;
        }
        boolean isMagic = true;
        int[] summList = new int[square.length + square[0].length + 2];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                summList[i] += square[i][j];
                summList[j + square.length] += square[i][j];
                if (i == j) summList[summList.length - 2] += square[i][j];
                if (i + j == square.length - 1) summList[summList.length - 1] += square[i][j];
            }
        }
        for (int i = 0; i < summList.length - 1; i++) {
            if (summList[i] != summList[i + 1]) {
                isMagic = false;
                break;
            }
        }
        return isMagic;
    }
}
