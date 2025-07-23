package com.example.helloworld.corejava.interfaces;

interface Birds {
  void canFly();
  //default method in interface
  default int getFlyheight() {
    return 100;
  }
}

class Eagle implements Birds {

  @Override
  public void canFly() {
    System.out.println("eagle can fly");
  }
}

public class DefaultMethodDemo {
  public static void main(String[] args) {
    Eagle eagle = new Eagle();
    eagle.canFly();
    System.out.println(eagle.getFlyheight());
  }
}
