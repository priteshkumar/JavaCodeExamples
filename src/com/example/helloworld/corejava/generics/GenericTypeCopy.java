package com.example.helloworld.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTypeCopy {
    /*
    generic type parameter enforces src,dst to be of same type
    e.g.  src -> List<Integer> dst-> List<Integer>
     */
    public static <T extends Number> void copy(List<T> src, List<T> dst) {
        for (int i = 0; i < src.size(); i++) {
            dst.add(src.get(i));
        }
    }

    public static void printList(List<?> list) {
        for (Object val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> src = Arrays.asList(1, 2, 3, 4);
        List<Integer> dst = new ArrayList<>();
        List<Float> fdst = new ArrayList<>();

        copy(src, dst);//valid

        //copy(src,fdst);//invalid

        printList(dst);
    }
}
