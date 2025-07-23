package com.example.helloworld;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter year");
        int year = input.nextInt();
        //The year is multiple of 400.
        //The year is a multiple of 4 and not a multiple of 100.
        boolean a = (year % 400) == 0;
        boolean b = (year % 4 == 0) && (year % 100 != 0);
        if (a || b) {
            System.out.println("leap year: " + year);
        } else {
            System.out.println("not a leap year: " + year);
        }
    }
}
