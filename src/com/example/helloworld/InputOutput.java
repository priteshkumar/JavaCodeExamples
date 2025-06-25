package com.example.helloworld;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer value:");
        int value = input.nextInt();
        System.out.println("you entered " + value);

        String test = input.next();
        System.out.println(test);
        String test2 = input.next();
        System.out.println(test2);
        //String linetest = input.nextLine();
        //System.out.println(linetest);
    }
}
