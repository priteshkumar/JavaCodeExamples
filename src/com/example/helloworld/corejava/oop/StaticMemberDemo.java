package com.example.helloworld.corejava.oop;

public class StaticMemberDemo {
    static int staticVar = 10;

    public void displayStaticvar() {
        System.out.println("static var is " + StaticMemberDemo.staticVar);
    }

    public static void main(String[] args) {
        StaticMemberDemo staticMemberDemo = new StaticMemberDemo();
        staticMemberDemo.displayStaticvar();
    }
}
