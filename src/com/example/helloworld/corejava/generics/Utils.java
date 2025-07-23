package com.example.helloworld.corejava.generics;

public class Utils {
    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    public static <T extends Comparable<T>> int check(T a, T b) {
        return a.compareTo(b);
    }

    public static void main(String[] args) {
        Utils.printValue("hello");
        Utils.printValue(23);
        System.out.println(Utils.check(22, 23));
    }
}
