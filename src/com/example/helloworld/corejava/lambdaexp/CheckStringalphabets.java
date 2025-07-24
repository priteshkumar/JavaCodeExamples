package com.example.helloworld.corejava.lambdaexp;

import java.util.function.Predicate;

public class CheckStringalphabets {
  public static void main(String[] args) {
    Predicate<Character> predicate =
        (value) -> {
          return Character.isLetter(value);
        };
    String value = "thisis9string";
    boolean flag = false;
    for (int i = 0; i < value.length(); i++) {
      if (predicate.test(value.charAt(i)) == false) {
        // System.out.println("not alphabetic");
        flag = true;
        break;
      }
    }
    if (flag == true) System.out.println("not alphabetic");
    else System.out.println("alphabetic");
  }
}
