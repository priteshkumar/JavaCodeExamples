package com.example.helloworld.corejava.interfaces;

interface I1 {
  default String getGreeting() {
    return "Hello from I1";
  }
}

interface I2 {
  default String getGreeting() {
    return "Hello from I2";
  }
}

public class CDemo implements I1, I2 {

  @Override
  public String getGreeting() {
    return I1.super.getGreeting() + " " + I2.super.getGreeting();
  }

  public static void main(String[] args) {
    CDemo cDemo = new CDemo();
    System.out.println(cDemo.getGreeting());
  }
}
