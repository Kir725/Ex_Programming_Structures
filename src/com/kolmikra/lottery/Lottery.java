package com.kolmikra.lottery;

import java.util.*;

public class Lottery {
    private static final Random generator = new Random();
    private List<Integer> lotteryList = new ArrayList<>();

    public Lottery() {
        for (int i = 1; i < 50; i++) {
            lotteryList.add(i);
        }
    }

    public List<Integer> getAllList() {
        return lotteryList;
    }

    public List<Integer> getWinningCombs() {
        List<Integer> winningList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            winningList.add(lotteryList.get(generator.nextInt(49)));
        }
        return winningList;
    }

    public void removeItems() {
        for (int i = 1; i < 7; i++) {
            lotteryList.remove(generator.nextInt(49 - i));
        }
    }

    public List<Integer> getSortedLotteryList() {
        List<Integer> sortedLotteryList = lotteryList;
        Collections.sort(sortedLotteryList);
        return sortedLotteryList;
    }

}
