package com.example.helloworld.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperLowerBoundCombinedDemo {
    public static void copyElems(List<? extends Number> a, List<?
            super Integer> b) {
        for (Number n : a) {
            b.add(n.intValue());
        }
    }

    public static void printList(List<?> list) {
        for (Object ob : list) {
            System.out.println(ob);
        }
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = new ArrayList<>();
        List<? super Integer> c = b;
        copyElems(a, b);
        printList(b);
    }
}
