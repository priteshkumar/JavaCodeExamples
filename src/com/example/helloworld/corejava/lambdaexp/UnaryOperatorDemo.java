package com.example.helloworld.corejava.lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
  public static void unaryOp(List<String> strings) {
    UnaryOperator<String> unaryOperator = (val) -> val.toUpperCase();
    strings.replaceAll(unaryOperator);
    strings.forEach(val -> System.out.println(val));
  }

  public static void main(String[] args) {
    List<String> stringList = new ArrayList<>();
    stringList.add("one");
    stringList.add("two");
    stringList.add("three");
    unaryOp(stringList);
  }
}
