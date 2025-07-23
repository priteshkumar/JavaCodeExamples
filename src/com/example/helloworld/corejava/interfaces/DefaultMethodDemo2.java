package com.example.helloworld.corejava.interfaces;

interface Birdss {
  default int canBreath() {
    return 100;
  }
}

interface Livingthing {
  default int canBreath() {
    return 200;
  }
}

public class DefaultMethodDemo2 implements Birdss, Livingthing {
  public static void main(String[] args) {
    DefaultMethodDemo2 defaultMethodDemo2 = new DefaultMethodDemo2();
    System.out.println(defaultMethodDemo2.canBreath());
  }

    @Override
    public int canBreath() {
        return Birdss.super.canBreath() + Livingthing.super.canBreath();
    }
}
