/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
/**
 * TODO
 *
 * @author TODO
 */
public class Parallels implements Runnable {
  public void run() {
    try {
      Singelton s1 = Singelton.getINSTANCE();
      s1.getText();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
