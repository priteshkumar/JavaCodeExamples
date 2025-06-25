package com.example.helloworld;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int[] a) {
        //10 20 30 40 50
        //1 2 3 4
        int n = a.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        //int[] a = {10,20,30,40,50};
        Scanner input = new Scanner(System.in);
        String[] val = input.nextLine().split(" ");
        int[] b = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            b[i] = Integer.parseInt(val[i]);
        }
        reverseArray(b);
        System.out.println("reversed array is ");
        for (int c : b) {
            System.out.print(c + " ");
        }
    }
}
