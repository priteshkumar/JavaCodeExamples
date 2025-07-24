package com.example.helloworld.corejava.lambdaexp;

import java.util.function.Predicate;

public class PredicateChainingDemo {
  public static void testNegate() {
    Predicate<String> testLen = (val) -> val.length() > 3;
    boolean flag = testLen.negate().test("ands");
    System.out.println(flag);
    flag = testLen.negate().test("an");
    System.out.println(flag);
  }

  public static void testOr() {
    Predicate<String> testLength = (val) -> val.length() == 3;
    Predicate<String> testStarts = (val) -> val.startsWith("an");
    boolean flag = testLength.or(testStarts).test("and");
    System.out.println(flag);
  }

  public static void main(String[] args) {
    Predicate<Integer> testGreater = (val) -> val >= 10;
    Predicate<Integer> testLesser = (val) -> val < 20;
    boolean flag = testGreater.and(testLesser).test(15);
    System.out.println(flag);
    testOr();
    testNegate();
  }
}
