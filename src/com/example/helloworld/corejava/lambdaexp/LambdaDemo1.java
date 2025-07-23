package com.example.helloworld.corejava.lambdaexp;

public class LambdaDemo1 {
  @FunctionalInterface
  interface Bird {
    void canFly(String val);
  }

  public static void main(String[] args) {
    Bird bird = (String value) -> System.out.println(value + " can fly");
    bird.canFly("eagle");
  }
}
