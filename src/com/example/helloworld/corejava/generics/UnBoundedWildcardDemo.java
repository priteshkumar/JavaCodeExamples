package com.example.helloworld.corejava.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildcardDemo {
    public static void printList(List<?> list){
        for(Object ob:list){
            System.out.println(ob);
        }
    }

    public static void main(String[] args) {
        List<Integer> intlist = Arrays.asList(1,2,3,4);
        printList(intlist);
        List<String> slist = Arrays.asList("my","world","good");
        printList(slist);
    }
}
