package com.example.helloworld.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardDemo {
    public static void addElem(List<? super Integer> list) {
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void printList(List<?> list) {
        for (Object ob : list) {
            System.out.println(ob);
        }
    }

    public static void printNumberList(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n.intValue());
        }
    }

    public static void main(String[] args) {
        List<Integer> intlist = new ArrayList<>();
        addElem(intlist);
        printList(intlist);
        printNumberList(intlist);
    }
}
