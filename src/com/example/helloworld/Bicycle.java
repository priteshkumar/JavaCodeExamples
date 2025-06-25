package com.example.helloworld;

public class Bicycle {
    int gear = 5;

    public Bicycle() {
        this.gear = 10;
    }

    public Bicycle(int gear) {
        this.gear = gear;
    }

    public void braking() {
        System.out.println("bike braking");
    }

    public void speeding() {
        this.speedUp();
        System.out.println("bike speeding");
    }

    private void speedUp() {
        System.out.println("set speed up");
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        System.out.println(bike.gear);
        bike.braking();
        bike.speeding();
    }

}
