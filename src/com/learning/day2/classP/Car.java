package com.learning.day2.classP;

/**
 * Created by kavin on 26/09/17.
 */
public class Car {
    public Integer tyreCount;
    public String color;
    public Integer doorCount;
    public Double mileage;
    public String vendor;
    public String variant;

    public Car(Integer tyreCount, String color, Integer doorCount, Double mileage, String vendor, String variant) {
        this.tyreCount = tyreCount;
        this.color = color;
        this.doorCount = doorCount;
        this.mileage = mileage;
        this.vendor = vendor;
        this.variant = variant;
    }

    //overloading or parametric polymorphism
    public Car(Integer tyreCount, String vendor) {
        this.tyreCount = tyreCount;
        this.vendor = vendor;
    }

    public Car(String color, Double mileage) {
        this.color = color;
        this.mileage = mileage;
    }


    public int getInt(int val) {
        return val * val;
    }

    public  int getInt(String str){
        return str.length();
    }

    @Override
    public String toString() {
        return "Car{" +
                "tyreCount=" + tyreCount +
                ", color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", mileage=" + mileage +
                ", vendor='" + vendor + '\'' +
                ", variant='" + variant + '\'' +
                '}';
    }
}
