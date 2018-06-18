/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
package FactoryMethodePattern;

import java.util.Date;

/**
 * TODO
 *
 * @author TODO
 */
public class Kantine {
  public static Essen getEssen() {
    Date jetzt = new Date();
    int stunde = jetzt.getHours();

    System.out.println("Jetzt: " + jetzt);

    if (stunde > 13) {
      return new Abendessen();
    }
    if (stunde > 11) {
      return new MittagEssen();
    }
    return new Geschlossen();
  }
}
