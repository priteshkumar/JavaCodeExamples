package com.example.helloworld;

import java.util.Scanner;

public class AmstrongNum {
    public static boolean checkarmStrong(int val) {
        String a = String.valueOf(val);
        int len = a.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            int b = Integer.parseInt(a.charAt(i) + "");
            sum = sum + (int) Math.pow(b, len);
            //System.out.println(sum);
        }
        if (sum == val) {
            System.out.println(val + " is armstrong number");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        //153 = 1^3 + 5^3 + 3^3 armstrong number
        //1634 = 1^4 + 6^4 + 3^4 + 4^4
        System.out.println(checkarmStrong(153));
        System.out.println(checkarmStrong(1634));
    }
}
