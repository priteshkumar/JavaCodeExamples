package com.example.helloworld.corejava.singleton;

public class BillPughSingleton {
  private BillPughSingleton() {}

  private static class SingletonHelper {
    private static final BillPughSingleton INSTANCE_OBJECT = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance() {
    return SingletonHelper.INSTANCE_OBJECT;
  }
}
