package com.example.helloworld;

public class TypeCasting {
    public static void main(String[] args) {
        int a = 9;
        long b = a;
        double c = a; //widening implicit cast smaller to larger type
        System.out.println(a);
        System.out.println(c);

        double d = 9.78;
        int e = (int)d; //narrowing cast larger to smaller type
        System.out.println(e);
    }
}
