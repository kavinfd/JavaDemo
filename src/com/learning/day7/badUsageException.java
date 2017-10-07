package com.learning.day7;

/**
 * Created by kavin on 07/10/17.
 */
public class badUsageException {
    public static void main(String args[]) {
        Integer a = 10;
        Integer b = 20;
        a = Math.abs(a);
        try {
            System.out.println(subtract(a, b));
        } catch (RuntimeException e) {
//            System.out.println("dont give give negative number");
            if (a < 0) {
                a = a * -1;
            }
            if (b < 0) {
                b = b * -1;
            }
            System.out.println(subtract(a, b));
        }
    }

    public static Integer subtract(Integer a, Integer b) {
        if (a < 0 || b < 0) {
            throw new RuntimeException();
        } else {
            return a - b;
        }
    }
}
