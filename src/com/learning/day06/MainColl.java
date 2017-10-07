package com.learning.day06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kavin on 05/10/17.
 */
public class MainColl {
    public static void main(String args[]) {
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("asdffs");
        stringList1.add("asdfd");
        stringList1.add("asdfasdg");
        List<String> list2 = new ArrayList<>();

        list2.add("val1");
        list2.add("val2");
        list2.add("val3");


        System.out.println(stringList1.get(2));

        System.out.println(stringList1);

        stringList1.add(2, "sec element");
        System.out.println(stringList1);

        stringList1.addAll(list2);

        System.out.println(stringList1);

        stringList1.addAll(0, list2);
        System.out.println(stringList1);

        System.out.println(stringList1.contains("val1"));

        System.out.println(stringList1.containsAll(list2));

//        stringList1.replaceAll(x -> x + x);
//        System.out.println(stringList1);


//        - ---------------------- 0 ---------------------- +
//
//                a - b
//
//                2 - 10
        stringList1.sort((string1, string2) -> string1.length() - string2.length());

        System.out.println(stringList1);

        List<List<String>> listOfList = new ArrayList<>();
        listOfList.add(new ArrayList<>());
        listOfList.add(new ArrayList<>());
        listOfList.add(new ArrayList<>());

        listOfList.get(0).add("asdf");
        listOfList.get(0).add("asdf");
        listOfList.get(0).add("asdf");

        listOfList.get(1).add("fdghdbfh");
        listOfList.get(1).add("fdghdbfh");
        listOfList.get(1).add("fdghdbfh");

        listOfList.get(2).add("cvbjhdfgh");
        listOfList.get(2).add("cvbjhdfgh");
        listOfList.get(2).add("cvbjhdfgh");

        System.out.println(listOfList);

//
////        null <- node1 -> <- node2 -> <- node3 -> null
//
//        /**
//         *   1.
//         *   2.
//         *   3.
//         *   4.
//         *
//         *   ||
//         *
//         *   5.
//         *   6.
//         *   7.
//         *   8.
//         *
//         *   ||
//         *
//         *
//         */
//        stringList2.get(2);


    }
}
