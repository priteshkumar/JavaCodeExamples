package com.example.helloworld;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int value = input.nextInt();
        switch(value % 2){
            case 0:
                System.out.println("even value");
                break;
            case 1:
                System.out.println("odd value");
                break;
            default:
                System.out.println("not even nor odd");
        }
    }
}
