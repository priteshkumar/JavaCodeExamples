package com.example.helloworld;

import java.util.Scanner;

public class FunctionDemo {
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static double addNumbers(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int a = input.nextInt();
        System.out.println("enter second number");
        int b = input.nextInt();
        System.out.println(addNumbers(a, b));
        double c = 45.5;
        double d = 40.0;
        System.out.println(addNumbers(c,d));
    }
}
