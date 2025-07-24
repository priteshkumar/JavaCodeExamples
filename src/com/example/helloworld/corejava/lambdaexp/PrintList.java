package com.example.helloworld.corejava.lambdaexp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class PrintList {
  public static void printList(List<Integer> integerList){
    //IntConsumer intConsumer = (val) -> System.out.println(val);
    Consumer<Integer> intConsumer = (val) -> System.out.println(val);
    integerList.forEach(intConsumer);
  }

  public static void main(String[] args) {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
    Consumer<Integer> integerConsumer = (val) -> System.out.println(val*val);
    integerList.forEach(val -> System.out.println(val * val));
    //integerList.forEach(integerConsumer);
    printList(integerList);
    List<Integer> integerList1 = integerList.stream().map(val -> val * 2).toList();
  }
}
