package com.learning.day00;


/**
 * Created by kavin on 26/09/17.
 */
public class Main {
    public static void main(String args[]) {
        // difficult to set value - done
        // chance to miss setting a value - done
        // difficult to print value every time

        Car volvo = new Car(4, "Red",4,25.0, "Volvo","Petrol");
        Car bmw = new Car(4, "Black",4,15.0, "BMW","Petrol");

//        System.out.println("Color : " + volvo.color);
//        System.out.println("DoorCount : " + volvo.doorCount);
//        System.out.println("Mileage : " + volvo.mileage);
//        System.out.println("TyreCount : " + volvo.tyreCount);
//        System.out.println("Vendor : " + volvo.vendor);
//        System.out.println("Variant : " + volvo.variant);

        System.out.println(volvo);
        System.out.println(bmw);

    }
}
