package com.example.helloworld.corejava.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcardDemo {
    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intlist = Arrays.asList(1, 2, 3, 4);
        System.out.println(sum(intlist));
        List<Double> doublelist = Arrays.asList(1.2, 2.4, 3.6);
        System.out.println(sum(doublelist));

        List<? extends Number> nlist = intlist;
        System.out.println(sum(nlist));
    }
}
