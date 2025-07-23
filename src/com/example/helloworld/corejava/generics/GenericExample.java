package com.example.helloworld.corejava.generics;

public class GenericExample<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        GenericExample<String> genericExample = new GenericExample<>();
        genericExample.setValue("hello");
        System.out.println(genericExample.getValue());
    }
}
