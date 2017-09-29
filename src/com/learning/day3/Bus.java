package com.learning.day3;

/**
 * Created by kavin on 29/09/17.
 */
public class Bus extends MassTransitVehicle {
    private String route;

    public Bus(String vendor, Integer tyreCount, String color, Integer doorCount, String route) {
        super(vendor, tyreCount, color, doorCount);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
