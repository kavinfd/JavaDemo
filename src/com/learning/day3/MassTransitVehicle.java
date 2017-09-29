package com.learning.day3;

/**
 * Created by kavin on 29/09/17.
 */
public class MassTransitVehicle extends Vehicle{
    public Integer doorCount;

    public MassTransitVehicle(String vendor, Integer tyreCount, String color, Integer doorCount) {
        super(vendor, tyreCount, color);
        this.doorCount = doorCount;
    }
}
