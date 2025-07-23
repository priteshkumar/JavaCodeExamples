package com.example.helloworld.corejava.oop;

public class WrapperClassDemo {
    public static void swap(Integer a, Integer b) {
        Integer temp = Integer.valueOf(a.intValue());
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        Integer a = Integer.valueOf(10);
        Integer b = Integer.valueOf(20);
        int c = a; //unboxing
        Integer d = 30;//autoboxing
        System.out.println(c);
        swap(a, b);
        System.out.println(a + " " + b);
    }
}
