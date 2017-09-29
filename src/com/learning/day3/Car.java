package com.learning.day3;

/**
 * Created by kavin on 29/09/17.
 */
public class Car extends MassTransitVehicle {
    private Boolean seatBelts;
    private Boolean airBags;

    public Car(String vendor, Integer tyreCount, String color, Integer doorCount, Boolean seatBelts, Boolean airBags) {
        super(vendor, tyreCount, color, doorCount);
        this.seatBelts = seatBelts;
        this.airBags = airBags;
    }

    public Boolean getSeatBelts() {
        return seatBelts;
    }

    public Boolean getAirBags() {
        return airBags;
    }
}
