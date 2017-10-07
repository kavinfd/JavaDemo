package com.learning.day7;

/**
 * Created by kavin on 07/10/17.
 */
public class ExceptionUsage {
    public static void main(String args[]) {
            //do some locking operation
//            func1();
        assert(1==2);
        String arr[] = new String[10];
        String a = "asdfasdf";
        Object obj = a;
        if(obj.getClass().equals(String.class)) {
            String i = (String) obj;
            System.out.println(i);
        }
    }

    public static void func1() {
        System.out.println("before exception throw");
        try {
            divide(1, 0);
        } catch (ArithmeticException e) {
            throw new RuntimeException("Chaining exception for some reason", e);
        }
    }

    public static Integer divide(Integer a, Integer b) {
        if (b == 0) {
            throw new ArithmeticException("Div by 0");
        }
        return a / b;
    }
}
