package com.example.helloworld.corejava.interfaces;

class Bird {
  // nested interface withing a class
  protected interface NonFlyingBird {
    void canRun();
  }
}

public class EagleDemo implements Bird.NonFlyingBird {

  @Override
  public void canRun() {
    System.out.println("eagle can run");
  }
}
