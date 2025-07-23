package com.example.helloworld.corejava.oop;

class Wrapper {
    private int id;
    private String var;
    static int aid = 10;

    public Wrapper() {
        this.id = 1;
        this.var = "hello";
    }

    class Inner {
        public void printInfo() {
            System.out.println("id is " + id);
            System.out.println("var is " + var);
            System.out.println("aid is " + aid);
        }
    }

}

public class MemberInnerClassDemo {
    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();
        Wrapper.Inner inner = wrapper.new Inner();
        inner.printInfo();
    }
}
