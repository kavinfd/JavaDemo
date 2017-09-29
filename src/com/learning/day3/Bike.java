package com.learning.day3;

/**
 * Created by kavin on 29/09/17.
 */
public class Bike extends Vehicle {
    private Boolean sideCar;

    public Bike(String vendor, Integer tyreCount, String color, Boolean sideCar) {
        super(vendor, tyreCount, color);
        this.sideCar = sideCar;
    }

    public Boolean getSideCar() {
        return sideCar;
    }
}
