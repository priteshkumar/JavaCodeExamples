package com.example.helloworld.corejava.lambdaexp;

import java.util.Arrays;
import java.util.List;

public class PrintList {
  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
    integerList.forEach(val -> System.out.println(val * val));
    List<Integer> integerList1 = integerList.stream().map(val -> val * 2).toList();
  }
}
