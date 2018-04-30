/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
package pattern.strategy;

/**
 * TODO
 *
 * @author TODO
 */
public class Context {
  private BerechnungStrategy berechnung;

  public Context(BerechnungStrategy b) {
    berechnung = b;
  }

  public int rechne(int a, int b) {
    return berechnung.berechne(a, b);
  }
}
