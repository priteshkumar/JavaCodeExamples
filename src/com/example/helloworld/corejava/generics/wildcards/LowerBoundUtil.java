package com.example.helloworld.corejava.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundUtil {
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }

    public static void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n.intValue() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        addNumbers(numbers);
        printNumbers(numbers);
    }
}
