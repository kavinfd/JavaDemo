package com.learning.day2.classP;

/**
 * Created by kavin on 28/09/17.
 */
public class Main {
    public static void main(String args[]) {
        Car car1 = new Car(1, "red", 2, 23D, "BMW", "");
        Car car2 = new Car(1, null, 2, 23D, "BMW", "");
        System.out.println(car1.isCarColorSame(car2));
    }
}
