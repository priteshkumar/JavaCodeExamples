package com.example.helloworld.corejava.lambdaexp;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo2 {
  public static void testFunctionLambda() {
    Function<Integer, String> function =
        (value) -> {
          return "value is " + value.toString();
        };
    System.out.println(function.apply(21));
  }

  public static void testPredicate() {
    Predicate<Integer> evenpredicate =
        (value) -> {
          if (value % 2 == 0) return true;
          return false;
        };
    System.out.println(evenpredicate.test(20));
    System.out.println(evenpredicate.test(31));
  }

  public static void main(String[] args) {
    Consumer<String> consumer = (value) -> System.out.println("value is " + value);
    consumer.accept("hello");

    Supplier<String> supplier = () -> "this is supplier example";
    System.out.println(supplier.get());
    testFunctionLambda();
    testPredicate();
  }
}
