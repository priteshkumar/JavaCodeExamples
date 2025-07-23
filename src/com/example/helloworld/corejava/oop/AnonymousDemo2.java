package com.example.helloworld.corejava.oop;

interface Helloworld {
    public void greet();

    public void greetSomeone(String someone);
}

public class AnonymousDemo2 {
    private static int id = 10;

    public static void main(String[] args) {
        Helloworld englishGreeting = new Helloworld() {
            @Override
            public void greet() {
                System.out.println("hello adam " + id);
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("hello " + someone);
            }
        };
        englishGreeting.greet();
        englishGreeting.greetSomeone("mark");
    }
}
