package com.example.helloworld.corejava.lambdaexp;

import java.util.function.Function;

public class FunctionChainingDemo {
  public static void testChaining() {
    Function<Integer, Double> function = val -> val / 2.0;
    Function<Double, Double> function1 = val -> val * 3;
    Function<Integer, Double> function2 = function.andThen(function1);
    System.out.println(function2.apply(15));
  }

  public static void testAndthen(Function<Integer, Integer> a, Function<Integer, Integer> b) {
    int val = 10;
    System.out.println(a.andThen(b).apply(val));
  }

  public static void main(String[] args) {
    testChaining();
    testAndthen(x -> x + 5, y -> y * 5);
  }
}
