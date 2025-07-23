package com.example.helloworld.corejava.oop;

class OuterClass {
    static class StaticInner {
        public void printInfo() {
            System.out.println("inside static inner class");
        }
    }
}

public class StaticNestedClassDemo {
    private String name;
    private int id;
    private static int aid;

    static class Nested {
        public void printInfo() {
            System.out.println("print info inside static nested class");
            aid = 20;
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.printInfo();
        OuterClass.StaticInner staticInner = new OuterClass.StaticInner();
        staticInner.printInfo();
    }
}
