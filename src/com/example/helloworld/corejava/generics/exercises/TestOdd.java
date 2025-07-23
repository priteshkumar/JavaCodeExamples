package com.example.helloworld.corejava.generics.exercises;

import java.util.Arrays;
import java.util.Collection;

public class TestOdd {
    /*
    Write a generic method to count the number of elements in
    a collection that have a specific property
    (for example, odd integers, prime numbers, palindromes).
    */

    public static <T extends Number> int countOdd(Collection<T> c) {
        int count = 0;
        for (Number n : c) {
            if (n.intValue() % 2 != 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Collection<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(countOdd(integers));
    }
}
