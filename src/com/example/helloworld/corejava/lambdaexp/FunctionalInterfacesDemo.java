package com.example.helloworld.corejava.lambdaexp;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public class FunctionalInterfacesDemo {
  public static void testIntsupplier() {
    Random random = new Random(314l);
    IntSupplier intSupplier = () -> random.nextInt(10);
    for (int i = 0; i < 5; i++) {
      System.out.println(intSupplier.getAsInt());
    }
  }

  public static void testIntconsumer(){
    IntConsumer intConsumer = (val) -> System.out.println(val);
    intConsumer.accept(10);
  }

  public static void main(String[] args) {
    testIntsupplier();
    testIntconsumer();
  }
}
