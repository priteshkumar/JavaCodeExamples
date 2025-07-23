package com.example.helloworld.corejava.generics;

import java.util.Arrays;
import java.util.List;

public class CountOddNums {
    public static <T extends Integer> int countOdd(List<T> a) {
        int count = 0;
        for (T n : a) {
            if (n.intValue() % 2 != 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(countOdd(a));
    }
}
