package com.learning.day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by kavin on 05/10/17.
 */
public class Main {
    public static void main(String args[]) {

        List<Integer> integerList = toArrayInteger(1, 2, 3);
//        System.out.println(integerList);

        List<String> stringList = toArrayString("str1", "str2", "str3");
//        System.out.println(stringList);

        List<String> integerListGeneric = toArrayGeneric(2, 3, 4, x -> String.valueOf(x + 2));
        System.out.println(integerListGeneric);

    }

    public static List<String> toArrayString(String value1, String value2, String value3) {
        ArrayList<String> stringList = new ArrayList<>();
        new LinkedList<>();
        stringList.add(value1);
        stringList.add(value2);
        stringList.add(value3);
//        String[] strarr = new String[10];
//        strarr[0] = "asdf";
//        strarr[1] = "asdf";
//        stringList.get(0);
        return stringList;
    }

    public static List<Integer> toArrayInteger(Integer value1, Integer value2, Integer value3) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(value1);
        intList.add(value2);
        intList.add(value3);
        return intList;
    }

    // I will give 3 inputs I need them to return by wrapping in an array
    public static <T, R> List<R> toArrayGeneric(T value1, T value2, T value3, Function<T, R> converter) {
        List<R> list = new ArrayList<>();
        list.add(converter.apply(value1));
        list.add(converter.apply(value2));
        list.add(converter.apply(value3));
        return list;
    }
}
