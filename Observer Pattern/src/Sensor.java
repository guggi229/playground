/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
import java.util.HashSet;
import java.util.Set;

// Überwachbar

/**
 * TODO
 *
 * @author TODO
 */
public class Sensor {
  private int temepratur;
  private Set<Observer> liste = new HashSet<Observer>();

  public void addObserver(Observer o) {
    liste.add(o);
  }

  public void removeOvserver(Observer o) {
    liste.remove(o);
  }

  private void notifyObserver() {
    for (Observer observer : liste) {
      observer.update();
    }
  }

  public int getTemepratur() {
    return temepratur;
  }

  public void setTemepratur(int temepratur) {
    this.temepratur = temepratur;
    notifyObserver();
  }
}
