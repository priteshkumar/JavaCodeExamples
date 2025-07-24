package com.example.helloworld.corejava.lambdaexp;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String[] args) {
    Random random = new Random(314l);
    Supplier<Integer> newRandom = () -> random.nextInt(10);
    for (int i = 0; i < 5; i++) {
      System.out.println(newRandom.get());
    }
  }
}
