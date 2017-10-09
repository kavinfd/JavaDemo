package com.learning.kannan.day0;

import java.util.Arrays;

/**
 * Created by kavin on 08/10/17.
 */
public class Main {
    public static void main(String args[]) {
        // chance of missing assignment of a field (property) - done
        // hard to set value for properties - done
        // repetition of code while displaying a object(duck) - done
        // Changing name of the duck should not be allowed

        //any one can update the step count

//        Duck d = new Duck();
        Duck duck = new Duck("Mike", "Anderson","Hey I am flying","Hey I am quacking", "Hey I am walking");
//        duck.flyingMessage = "Hey I am flying";
//        duck.quackingMessage = "Hey I am quacking";
//        duck.walkingMessage = "Hey I am walking";
//        duck.name = "Hey I am Mike";

//        System.out.println(duck.flyingMessage);
//        System.out.println(duck.quackingMessage);
//        System.out.println(duck.walkingMessage);
//        System.out.println(duck.name);

        System.out.println(duck.doWalk());
        System.out.println(duck.doWalk());
        System.out.println(duck.doWalk());
        System.out.println(duck.doWalk());
        duck.setStepCount(1000);
        System.out.println(duck.getStepCount());
        System.out.println(duck.getStepCount());
        System.out.println(duck.getStepCount());
        System.out.println(duck.getStepCount());
    }
}
