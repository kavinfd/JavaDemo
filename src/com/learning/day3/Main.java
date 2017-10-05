package com.learning.day3;

import java.util.function.Supplier;

/**
 * Created by kavin on 29/09/17.
 */
public class Main {
    public static void main(String args[]) {
//        Vehicle v = new Vehicle("BMW", 4, "Red");
        Car car = new Car("BMW", 4, "Red", 2, true, true, "UBER", "SHARE");
        Bike bike = new Bike("Bajaj", 2, "Black", false, "OLA", "SOLO");
        Bus bus = new Bus("Volvo", 4, "White", 3, "Banglore-Chennai");

        String strArray[] = new String[10];

        Object objArray[] = new Object[10];
        objArray[0] = car;
        objArray[1] = bike;
        objArray[2] = bus;

        Vehicle vehicleArray[] = new Vehicle[10];
        vehicleArray[0] = car;
        vehicleArray[1] = bike;
        vehicleArray[2] = bus;

        MassTransitVehicle massTransitVehicleArray[] = new MassTransitVehicle[10];
        massTransitVehicleArray[0] = car;
        massTransitVehicleArray[1] = bus;

        Vehicle testVeh = car; //Liskov substitution

        car = (Car) testVeh; //Type casting
        // class inheritance hierarchy java
        //2

        MassTransitVehicle mv = car;
        //System.out.println(bus);

        Vehicle v = new Vehicle("asdf", 3, "asdf") {
            @Override
            public String toString() {
                return "dummy to string";
            }
        };

        CommercialVehicle cv = new CommercialVehicle() {
            public Integer t = 3;

            @Override
            public String getCommercialPartner() {

                return "OLasdfA";

            }

            @Override
            public void setCommercialPartner(String commercialPartner) {

            }

            @Override
            public String getBookingMethod() {
                return "SELF";
            }
        };
        // printCommercialPartners(cv);
        printCommercialPartners(cv::getCommercialPartner);
//        printCommercialPartners(cv::getBookingMethod);

        //lambda
        String var = "testvar";
        Supplier<String> s1 = () -> "str";
        Supplier<String> s2 = s1;
        System.out.println(s1.equals(s2));
//        System.out.println(v);
//        printCommercialPartners(car, bike);

    }

    public static void printCommercialPartners(CommercialVehicle... commercialVehicles) {
        for (CommercialVehicle comm :
                commercialVehicles) {
            System.out.println(comm.getCommercialPartner());
        }
    }

    ////java 8
    public static void printCommercialPartners(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
    ////java 8

    public static class Result {
        String vendor;
        Integer tyreCount;

        public Result(String vendor, Integer tyreCount) {
            this.vendor = vendor;
            this.tyreCount = tyreCount;
        }
    }

    //Bad way
    public static String[] getVendors(Object objArray[]) {
        String result[] = new String[10];
        for (int i = 0; i < objArray.length; i++) {
            Object current = objArray[i];
            if (current.getClass().equals(Car.class)) {
                result[i] = ((Car) current).getVendor();
            } else if (current.getClass().equals(Bike.class)) {
                result[i] = ((Bike) current).getVendor();
            } else if (current.getClass().equals(Bus.class)) {
                result[i] = ((Bus) current).getVendor();
            }
        }
        return result;
    }

    //IntermediateWay way
    public static String[] getVendors1(Object objArray[]) {
        String result[] = new String[10];
        for (int i = 0; i < objArray.length; i++) {
            Object current = objArray[i];
            if (current.getClass().equals(Vehicle.class)) {
                result[i] = ((Vehicle) current).getVendor();
            }
        }
        return result;
    }

    //good way
    public static Result[] getVendors(Vehicle vehicles[]) {
        Result result[] = new Result[10];
        for (int i = 0; i < vehicles.length; i++) {
            result[i] = new Result(vehicles[i].getVendor(), vehicles[i].getTyreCount());
        }
        return result;
    }
}
