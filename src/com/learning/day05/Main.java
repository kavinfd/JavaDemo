package com.learning.day05;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by kavin on 04/10/17.
 */
public class Main {
    public static void main(String args[]) {
        Supplier<String> str1 = () -> "asdfasdf";
        Supplier<String> str2 = new Supplier<String>() {
            @Override
            public String get() {
                return "asdfasdf";
            }
        };
        Function<Integer, String> fun1 = inp -> String.valueOf(inp+2);
        System.out.println(fun1.apply(2));

        BiFunction<Integer, Integer, String> fun2 = (inp1, inp2) -> String.valueOf(inp1 + inp2);
        System.out.println(fun2.apply(3, 5));

        TriFunc<String, String, String, Integer> triFunc = (s1, s2, s3) -> Integer.parseInt(s1) + Integer.parseInt(s2) + Integer.parseInt(s3);

        System.out.println(triFunc.apply("1","3","56"));
    }

    public static String functionname(Integer inp) {
        Integer t = inp + inp;
        return String.valueOf(t);
    }
}
