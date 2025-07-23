package com.example.helloworld.corejava.enums;

import com.sun.jdi.PathSearchingVirtualMachine;

enum EnumSample {
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY;
}

public class EnumDemo {
  public static void main(String[] args) {
    System.out.println(EnumSample.MONDAY);
    for (EnumSample sample : EnumSample.values()) {
      System.out.println(sample.ordinal());
    }

    EnumSample sample = EnumSample.valueOf("FRIDAY");
    System.out.println(sample.name());
  }
}
