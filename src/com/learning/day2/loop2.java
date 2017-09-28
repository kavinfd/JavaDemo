package com.learning.day2;

/**
 * Created by kavin on 28/09/17.
 */
public class loop2 {
    static int i = 0;

    public static void main(String args[]) {
        for (;;) {
            System.out.println(i++);
        }
    }

    public static boolean checkCondition() {
        return i < 10;
    }

    public static int incrementI() {
        return i++;
    }
}
