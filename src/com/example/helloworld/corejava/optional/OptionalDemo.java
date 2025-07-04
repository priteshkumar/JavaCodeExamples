package com.example.helloworld.corejava.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
    public static void testOfNullable() {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());
        //System.out.println(opt.get());
    }

    public static void testElse() {
        String name = null;
        String val = Optional.ofNullable(name).orElse("mark");
        System.out.println(val);
    }

    public static void testElsethrow() {
        String name = null;
        try {
            String val = Optional.ofNullable(name).orElseThrow();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Optional<String> str = Optional.of("hello");
        System.out.println(str.isPresent());
        if (str.isPresent())
            System.out.println(str.get());

        //the below causes nullpointer exception
        // Optional<String> opt = Optional.of(null);
        //System.out.println(opt.isPresent());
        testOfNullable();
        testElse();
        testElsethrow();
    }
}
