package com.learning.day3;

/**
 * Created by kavin on 29/09/17.
 */
public class Bike extends Vehicle implements CommercialVehicle {
    private Boolean sideCar;
    private String commercialPartner;
    private String bookingMethod;

    public Bike(String vendor, Integer tyreCount, String color, Boolean sideCar, String commercialPartner, String bookingMethod) {
        super(vendor, tyreCount, color);
        this.sideCar = sideCar;
        this.commercialPartner = commercialPartner;
        this.bookingMethod = bookingMethod;
    }

    public Boolean getSideCar() {
        return sideCar;
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
