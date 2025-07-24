package com.example.helloworld.corejava.lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TestLambdaInCollections {
  public static <T> void printList(List<T> list) {
    list.forEach(val -> System.out.println(val));
  }

  public static void removeElem(List<Integer> integerList) {
    Predicate<Integer> predicate = (val) -> val % 2 != 0;
    integerList.removeIf(predicate);
    printList(integerList);
  }

  public static void replaceString(List<String> strings) {
    UnaryOperator<String> unaryOperator = (val) -> val.toUpperCase();
    strings.replaceAll(unaryOperator);
    printList(strings);
  }

  public static void main(String[] args) {
    // consumer test foreach
    List<Integer> integerList = new ArrayList<>();
    for (int i = 0; i < 10; i++) integerList.add(i + 1);
    printList(integerList);
    // predicate test removeIf
    removeElem(integerList);
    // UnaryOp test replaceAll
    List<String> strings = new ArrayList<>();
    strings.add("one");
    strings.add("two");
    strings.add("three");
    replaceString(strings);
  }
}
