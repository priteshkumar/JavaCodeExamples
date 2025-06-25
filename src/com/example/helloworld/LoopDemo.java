package com.example.helloworld;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = Integer.parseInt(input.nextLine());
        String[] values = input.nextLine().split(" ");
        //System.out.println(values);
        for (int i = 0; i < values.length; i++) {
            int a = Integer.parseInt(values[i]);
            System.out.println(a + val);
        }
    }
}
