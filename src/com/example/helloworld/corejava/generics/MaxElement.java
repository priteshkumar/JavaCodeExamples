package com.example.helloworld.corejava.generics;

import java.util.Arrays;
import java.util.List;

public class MaxElement {
    public static <T extends Comparable<T>> T findMax(List<T> list,
                                                      int i,
                                                      int j) {
        T maxval = list.get(i);
        for (int k = i; k < j; k++) {
            if (list.get(k).compareTo(maxval) > 0)
                maxval = list.get(k);
        }
        return maxval;
    }

    public static void main(String[] args) {
        List<Integer> intlist = Arrays.asList(1, 2, 3, 6, 5, 4);
        System.out.println(findMax(intlist, 0, 3));
        List<Double> dlist = Arrays.asList(1.2, 3.4, 5.6, 3.3, 4.2);
        System.out.println(findMax(dlist, 0, 4));
    }
}
