package com.learning.day0.automobile;

import com.learning.day0.automobile.Car;

public class Main {


    public static void main(String[] args) {
        // chance to miss entering value - done
        // chance to change the value - done
        // repeated code for displaying - done
        // cant change tyre count since its final - done
        // updating wheel count has to update hasExtraWheel - done
        // since hasExtraWheel is public it can be edited from out side

        Car volvo = new Car(2, "v8", "Volvo", 4);
        Car ferrari = new Car(2, "v8", "ferrari", 4);
        Car bmw = new Car(2, "v8", "BMW", 4);

        volvo.setTyreCount(5);

        System.out.println(volvo);
        System.out.println(ferrari);
        System.out.println(bmw);
    }
}
