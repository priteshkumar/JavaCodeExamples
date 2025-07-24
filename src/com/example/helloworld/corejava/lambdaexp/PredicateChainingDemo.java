package com.example.helloworld.corejava.lambdaexp;

import java.util.List;
import java.util.function.Predicate;

public class PredicateChainingDemo {
  /*
  Suppose you need to process a list of strings,
  to keep only the strings that are non-null, non-empty, and shorter than 5 characters.
   */
  public static void testString(){
    Predicate<String> nonNull = (val) -> val != null;
    Predicate<String> nonEmpty = (val) -> val.length() > 0;
    Predicate<String> shorterThanfive = (val) -> val.length() < 5;

    Predicate<String> test = nonNull.and(nonEmpty).and(shorterThanfive);
    String x = "work";
    //test.test(x);
    System.out.println(x + " is " + test.test(x));
    x = null;
    System.out.println(test.test(x));
    x = "";
    System.out.println(test.test(x));
    x ="hello";
    System.out.println(test.test(x));
  }

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
    testString();
  }
}
