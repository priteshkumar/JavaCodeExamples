package com.example.helloworld;
import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the angles");
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();
        boolean greaterthanzero = (angle1 > 0) && (angle2 > 0) && (angle3 > 0);

        if(greaterthanzero && ((angle1 + angle2 + angle3) == 180)){
            System.out.println("valid triangle");
        }
        else{
            System.out.println("invalid triangle");
        }
    }
}
