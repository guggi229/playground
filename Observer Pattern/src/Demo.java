/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
/**
 * Demo
 *
 * @author STG
 */
public class Demo {
  public static void main(String[] args) {
    Sensor sen1 = new Sensor();
    Anzeige a1 = new Anzeige();
    Anzeige a2 = new Anzeige();
    Kühlung k1 = new Kühlung();

    sen1.addObserver(a1);
    sen1.addObserver(a2);
    sen1.addObserver(k1);

    sen1.setTemepratur(20);
    System.out.println("***********************");
    sen1.setTemepratur(25);
  }
}
