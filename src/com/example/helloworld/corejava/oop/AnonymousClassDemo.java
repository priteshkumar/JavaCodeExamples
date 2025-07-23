package com.example.helloworld.corejava.oop;

abstract class MyCar {
    public abstract void pressBreak();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        MyCar myCar = new MyCar() {
            @Override
            public void pressBreak() {
                System.out.println("car press brake");
            }
        };
        myCar.pressBreak();
    }
}
