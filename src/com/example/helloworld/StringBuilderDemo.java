package com.example.helloworld;

public class StringBuilderDemo {
    public static void main(String[] args) {
        //stringbuilder allows mutable strings
        StringBuilder sb = new StringBuilder("hello");
        sb.append("abc");
        System.out.println(sb);

        sb.append("def");
        System.out.println(sb);

        sb.insert(0, 'q');
        System.out.println(sb);

        sb.setCharAt(1, 'a');
        System.out.println(sb);

        System.out.println(sb.toString());

        sb.insert(0, "hello");
        System.out.println(sb);

    }
}
