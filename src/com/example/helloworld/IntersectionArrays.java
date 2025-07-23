package com.example.helloworld;

import java.util.ArrayList;

public class IntersectionArrays {
    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> c = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                c.add(a[i]);
                i++;
                j++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {10, 19, 20, 30, 40, 40, 40, 50};
        int[] b = {15, 16, 17, 20, 25, 30, 30, 40, 40};
        System.out.println(intersection(a, b));
    }
}
