package com.learning.day3;

/**
 * Created by kavin on 29/09/17.
 */
public class Car extends MassTransitVehicle implements CommercialVehicle {
    private Boolean seatBelts;
    private Boolean airBags;
    private String commercialPartner;
    private String bookingMethod;

    public Car(String vendor, Integer tyreCount, String color, Integer doorCount, Boolean seatBelts, Boolean airBags, String commercialPartner, String bookingMethod) {
        super(vendor, tyreCount, color, doorCount);
        this.seatBelts = seatBelts;
        this.airBags = airBags;
        this.commercialPartner = commercialPartner;
        this.bookingMethod = bookingMethod;
    }

    public Boolean getSeatBelts() {
        return seatBelts;
    }

    public Boolean getAirBags() {
        return airBags;
    }


    @Override
    public String toString() {
        return "Car{" +
                "seatBelts=" + seatBelts +
                ", airBags=" + airBags +
                '}';
    }

    @Override
    public String getCommercialPartner() {
        return commercialPartner;
    }

    @Override
    public void setCommercialPartner(String commercialPartner) {
        this.commercialPartner = commercialPartner;
    }

    @Override
    public String getBookingMethod() {
        return bookingMethod;
    }
}
