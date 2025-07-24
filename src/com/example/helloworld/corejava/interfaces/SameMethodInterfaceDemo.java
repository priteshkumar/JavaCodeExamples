package com.example.helloworld.corejava.interfaces;

public class SameMethodInterfaceDemo {
  interface I1 {
    void greet();
  }

  interface I2 {
    void greet();

    void print();
  }

  class Demo implements I1, I2 {

    @Override
    public void greet() {
      System.out.println("greetings");
    }

    @Override
    public void print() {
      System.out.println("print hello");
    }
  }

  public static void main(String[] args) {
    SameMethodInterfaceDemo sameMethodInterfaceDemo = new SameMethodInterfaceDemo();
    SameMethodInterfaceDemo.Demo demo = sameMethodInterfaceDemo.new Demo();
    demo.greet();
    demo.print();
  }
}
