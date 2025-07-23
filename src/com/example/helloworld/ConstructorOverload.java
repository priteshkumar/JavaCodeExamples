package com.example.helloworld;

public class ConstructorOverload {
    private int a;
    private int b;

    private ConstructorOverload(int i, int j) {
        this.a = i;
        this.b = j;
    }

    private ConstructorOverload(int i) {
        this(i, i);
    }

    public ConstructorOverload() {
        this(0);
    }

    @Override
    public String toString() {
        return "ConstructorOverload{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        ConstructorOverload c = new ConstructorOverload();
        System.out.println(c);
        ConstructorOverload c2 = new ConstructorOverload(2);
        System.out.println(c2);
    }
}
