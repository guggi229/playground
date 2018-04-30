/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
/**
 * TODO
 *
 * @author TODO
 */
public class Test {
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(new Parallels());
    Thread thread2 = new Thread(new Parallels());

    thread.start();
    thread2.start();
  }
}
