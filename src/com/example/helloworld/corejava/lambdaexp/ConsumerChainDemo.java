package com.example.helloworld.corejava.lambdaexp;

import java.util.function.Consumer;
import java.util.logging.Logger;

public class ConsumerChainDemo {
  public static void testChaining() {
    Logger logger = Logger.getLogger("consumerchain");
    Consumer<String> log = (val) -> logger.info(val);
    Consumer<String> print = val -> System.out.println(val);
    log.andThen(print).accept("hello");
  }

  public static void main(String[] args) {
    testChaining();
  }
}
