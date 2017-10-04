package com.learning.day3;

/**
 * Created by kavin on 29/09/17.
 */
public abstract class Vehicle {
    private String vendor;
    private Integer tyreCount;
    private String color;

    public Vehicle(String vendor, Integer tyreCount, String color) {
        this.vendor = vendor;
        this.tyreCount = tyreCount;
        this.color = color;
    }

    public String getVendor() {
        return vendor;
    }

    public Integer getTyreCount() {
        return tyreCount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vendor='" + vendor + '\'' +
                ", tyreCount=" + tyreCount +
                ", color='" + color + '\'' +
                '}';
    }
}
