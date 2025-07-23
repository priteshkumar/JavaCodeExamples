package com.example.helloworld.corejava.generics;

public class TestGenericDemo {
    public static <T extends Number> double sum(T[] a) {
        double sum = 0;
        for (T val : a) {
            sum += val.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        System.out.println(sum(a));
    }
}
