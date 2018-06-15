/*
 * Copyright 2013 - 2017 by PostFinance Ltd - All rights reserved
 */
package ch.guggisberg.stefan.isp.demo;

import ch.guggisberg.stefan.isp.SimpleDoor;
import ch.guggisberg.stefan.isp.TimedDoor;

/**
 * TODO
 *
 * @author TODO
 */
public class Demo {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    SimpleDoor sd = new SimpleDoor();
    sd.lock();
    sd.unlock();

    TimedDoor td = new TimedDoor();
    td.lock();
    td.unlock();
    td.timeout();
  }
}
