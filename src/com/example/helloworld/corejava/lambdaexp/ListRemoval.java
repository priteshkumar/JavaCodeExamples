package com.example.helloworld.corejava.lambdaexp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class ListRemoval {
  public static void removeElements(List<Integer> integerList){
    //IntPredicate intPredicate = (val) -> val % 2 == 0;
    Predicate<Integer> intPredicate = (val) -> val % 2 != 0;
    integerList.removeIf(intPredicate);
    integerList.forEach(val -> System.out.println(val));
  }

  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();
    for(int i=1; i <=5;i++)
        integerList.add(i);
    Predicate<Integer> evenpredicate = (val) -> val % 2 == 0;
    for (int i = 0; i < integerList.size(); i++) {
      if (evenpredicate.test(integerList.get(i)) == true){
          integerList.remove(i);
      }
    }
    integerList.forEach(val -> System.out.println(val));
    integerList.clear();
    for(int i=1; i <=5;i++)
      integerList.add(i);
    removeElements(integerList);

  }
}
