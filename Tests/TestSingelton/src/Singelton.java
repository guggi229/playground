/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
/**
 * TODO
 *
 * @author TODO
 */
public class Singelton {
  private static Singelton INSTANCE;

  private Singelton() {
  }

  public static synchronized Singelton getINSTANCE() throws InterruptedException {
    if (INSTANCE == null) {
      INSTANCE = new Singelton();
    }

    return INSTANCE;
  }

  public void getText() throws InterruptedException {
    synchronized (this) {
      System.out.println(Thread.currentThread().getName());
      System.out.println("Go sleeping......");
      System.out.println(Thread.currentThread().getName());
      Thread.sleep(3000);
      System.out.println("Go to weakup......");
    }
  }
}
