package com.example.helloworld.corejava.generics;

public class ExchangePositions {
    public static <T> void exchangePos(T[] a, int i, int j) {
        T swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static <T> void printArr(T[] a) {
        for (T val : a) {
            System.out.println(val);
        }
    }

    public static <T extends Comparable<T>> T max(T x, T y) {
        //return x > y ? x : y;
        return x.compareTo(y) >= 0 ? x : y;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[5];
        for (int i = 0; i < 5; i++) {
            a[i] = i + 1;
        }
        exchangePos(a, 1, 2);
        printArr(a);

    }
}
