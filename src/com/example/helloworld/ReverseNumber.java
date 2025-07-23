package com.example.helloworld;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int val = input.nextInt();
        int reverse = 0;
        //1234
        int i = val;
        while (i > 0) {
            reverse = (reverse * 10) + (i % 10);
            i = i / 10;
        }
        System.out.println(reverse);
    }
}
