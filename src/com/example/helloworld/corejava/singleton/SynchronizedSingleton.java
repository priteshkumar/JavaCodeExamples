package com.example.helloworld.corejava.singleton;

public class SynchronizedSingleton {
  private static volatile SynchronizedSingleton synchronizedSingleton;

  private SynchronizedSingleton() {}

  public static SynchronizedSingleton getInstance() {
    if (synchronizedSingleton == null) {
      synchronized (SynchronizedSingleton.class) {
        if (synchronizedSingleton == null) {
          synchronizedSingleton = new SynchronizedSingleton();
        }
      }
    }
    return synchronizedSingleton;
  }
}
