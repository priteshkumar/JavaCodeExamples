package com.example.helloworld.corejava.enums;

enum CustomEnum {
  MONDAY(101),
  TUESDAY(102),
  WEDNESDAY(103),
  THURSDAY(104),
  FRIDAY(105),
  SATURDAY(106),
  SUNDAY(107);

  private int val;

  CustomEnum(int val) {
    this.val = val;
  }

  public int getVal() {
    return val;
  }

  public static CustomEnum getEnumfromValue(int val) {
    for (CustomEnum customEnum : CustomEnum.values()) {
      if (customEnum.val == val) {
        return customEnum;
      }
    }
    return null;
  }
}

public class EnumDemo2 {
  public static void main(String[] args) {
    CustomEnum customEnum = CustomEnum.getEnumfromValue(107);
    System.out.println(customEnum.name());
    CustomEnum myval = CustomEnum.SATURDAY;
    testCustomEnum(myval);
  }

  public static void testCustomEnum(CustomEnum customEnum) {
    switch (customEnum) {
      case CustomEnum.MONDAY:
        System.out.println("it is " + customEnum.name());
        break;
      case CustomEnum.TUESDAY:
        System.out.println("it is " + customEnum.name());
        break;
      case CustomEnum.SATURDAY:
        System.out.println("it is " + customEnum.name());
        break;
    }
  }
}
