package com.learning.day2;

/**
 * Created by kavin on 28/09/17.
 */
public class loops {
    public static void main(String args[]) {
        int i = 0;
        for (; checkCondition(i); i = getNewI(i)) {
            System.out.println(i);
        }
    }

    public static boolean checkCondition(int val) {
        return val < 10;
    }

    public static int getNewI(int oldI) {
        return oldI + 1;
    }
}
