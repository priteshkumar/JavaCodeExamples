package com.example.helloworld.corejava.lambdaexp;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
  public static int add(int x, int y) {
    BinaryOperator<Integer> add = (a, b) -> a + b;
    return add.apply(x, y);
  }

  public static int sub(int x, int y) {
    BinaryOperator<Integer> sub = (a, b) -> a - b;
    return sub.apply(x, y);
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 12;
    System.out.println(add(x, y));
    System.out.println(sub(y,x));
  }
}
