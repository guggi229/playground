/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
package main;

import pattern.strategy.BerechnungAdd;
import pattern.strategy.BerechnungSub;
import pattern.strategy.Context;

// https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
/**
 * TODO
 *
 * @author TODO
 */
public class Demo {
  public static void main(String[] args) {
    Context context = new Context(new BerechnungAdd());
    System.out.println(context.rechne(5, 6));

    context = new Context(new BerechnungSub());
    System.out.println(context.rechne(10, 4));
  }
}
