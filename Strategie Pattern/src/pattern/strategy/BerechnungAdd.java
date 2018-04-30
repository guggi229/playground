/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
package pattern.strategy;

/**
 * TODO
 *
 * @author TODO
 */
public class BerechnungAdd implements BerechnungStrategy {
  @Override
  public int berechne(int a, int b) {
    return a + b;
  }
}
