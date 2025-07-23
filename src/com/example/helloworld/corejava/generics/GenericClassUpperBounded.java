package com.example.helloworld.corejava.generics;

public class GenericClassUpperBounded<T extends Number & Comparable<T>> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        GenericClassUpperBounded<Integer> genericClassUpperBounded =
                new GenericClassUpperBounded<>();
        genericClassUpperBounded.setValue(Integer.valueOf(11));
        System.out.println(genericClassUpperBounded.getValue());
    }
}
