package com.example.helloworld.corejava.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundUtil {
    class Vehicle {
        public void speedUp() {
            System.out.println("speed up the vehicle");
        }
    }

    class Car extends Vehicle {
        public void speedUp() {
            System.out.println("speed up the car");
        }
    }

    class Bus extends Vehicle {
        public void speedUp() {
            System.out.println("speed up the bus");
        }
    }

    public static void speedAll(List<? extends Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.speedUp();
        }
    }

    public static void main(String[] args) {
        UpperBoundUtil upperBoundUtil = new UpperBoundUtil();
        List<Car> cars = new ArrayList<>();
        cars.add(upperBoundUtil.new Car());
        speedAll(cars);
        List<Bus> buses = new ArrayList<>();
        buses.add(upperBoundUtil.new Bus());
        speedAll(buses);
    }
}
