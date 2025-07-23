package com.example.helloworld;

public class StringDemo {
    public static void main(String[] args) {
        //strings are immutable in java
        String first = "Java";
        String second = "Java";
        System.out.println(first == second);//same reference
        System.out.println(first.equals(second));

        String a = new String("python");
        String b = new String("python");
        System.out.println(a == b);//different reference
        System.out.println(a.equals(b));

        //string methods
        System.out.println(first.concat(a));
        System.out.println(first.substring(1));
        System.out.println(first.substring(1, 3));
    }
}
