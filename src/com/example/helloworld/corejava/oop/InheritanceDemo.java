package com.example.helloworld.corejava.oop;

class Vehicle {
    public void applyBrake() {
        System.out.println("vehicle brake");
    }
}

class Car extends Vehicle {
    public void applyBrake() {
        System.out.println("car brake");
    }

    public void speed() {
        System.out.println("apply speed");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.applyBrake();
        Car car = (Car) vehicle;
        car.speed();
    }
}
