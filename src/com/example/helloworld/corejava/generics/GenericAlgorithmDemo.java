package com.example.helloworld.corejava.generics;

public class GenericAlgorithmDemo {
    public static <T extends Comparable<T>> int countGreater(T[] a,T elem){
        int count = 0;
        for(T val:a){
            if(val.compareTo(elem) > 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[4];
        for(int i=0;i < a.length;i++){
            a[i] = i;
        }
        Integer b = 1;
        //System.out.println(a[1].compareTo(a[0]));
        System.out.println(countGreater(a,b));
    }

}
