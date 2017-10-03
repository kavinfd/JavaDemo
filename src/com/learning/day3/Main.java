package com.learning.day3;

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

        printCommercialPartners(car, bike);

    }

    public static void printCommercialPartners(CommercialVehicle... commercialVehicles){
        for (CommercialVehicle comm:
             commercialVehicles) {
            System.out.println(comm.getCommercialPartner());
        }
    }

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
