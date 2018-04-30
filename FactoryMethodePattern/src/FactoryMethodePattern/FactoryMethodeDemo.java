/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
package FactoryMethodePattern;

/**
 * TODO
 *
 * @author TODO
 */
public class FactoryMethodeDemo {
  public static void main(String[] args) {
    Essen meinEssen = Kantine.getEssen();
    System.out.println(meinEssen.getBeschreibung());
  }
}
