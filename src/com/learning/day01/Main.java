package com.learning.day01;

import java.util.Arrays;

/**
 * Created by kavin on 27/09/17.
 */
public class Main {
    public static Integer gStaticInt = 100;
    public Integer gNonStaticInt = 200;

    public Main() {
        System.out.println(gNonStaticInt);
        System.out.println(gStaticInt);
    }

    public static void main(String args[]) {
        byte b1 = 123;
        Byte wb1 = b1;
        short s1 = 2;
        Short ws1 = s1;
        int i1 = 130;
        Integer Wi1 = i1;
        long l1 = 123;
        Long wl1 = l1;
        float f1 = 24f;
        Float wf1 = f1;
        double d1 = 23d;
        Double wd1 = d1;
        char c1 = 'c';
        Character wc1 = c1;
        boolean bool1 = true;
        Boolean wBool1 = bool1;

//        i1 = b1;
        c1 = (char) i1;
        int t = i1 >> 2;
        i1 >>= 2;
        System.out.println("Byte : " + b1);
        Integer i2 = i1 + i1;
        Byte b3 = b1;
        func2(i2);


        //arrays
        String[] str = new String[]{"234", "1234", "asdfasdf", "asdfasdf"};
        System.out.println(Arrays.toString(str));
        Integer[] intArray = new Integer[10];
        System.out.println(func1(intArray));
        System.out.println(Arrays.toString(intArray));
        System.out.println(intArray[0]);
        System.out.println(gStaticInt);
        System.out.println(new Main().gNonStaticInt);

        if(i1>2)
            System.out.print("adsfasdf");
    }

    public static boolean func1(Integer[] output) {
        output[0] = 10;
        output[1] = 11;
        return true;
    }

    public static void func2(Integer i) {
        System.out.println(i);
    }
}
