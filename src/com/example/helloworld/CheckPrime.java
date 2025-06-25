package com.example.helloworld;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int val = input.nextInt();
        if (val == 1) {
            System.out.println(val + " is prime number");
            return;
        }else if(val == 2){
            System.out.println(val + " is not a prime number");
            return;
        }
        boolean primeflag = true;
        for (int i = 2; i <= val / 2; i++) {
            if (val % i == 0) {
                primeflag = false;
                break;
            }
        }
        if (primeflag) {
            System.out.println(val + " is prime number");
        } else {
            System.out.println(val + " is not a prime number");
        }
    }
}
