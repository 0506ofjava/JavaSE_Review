package collectionBasic.car.impl;

import collectionBasic.car.Car;

/**
 * @author yq
 * @description
 * @create 2019-11-12-47
 */
public class Bmw implements Car {
  public Bmw() {
    System.out.println("I'm Bmw");
  }

    @Override
    public String toString() {
        return "Bmw{}";
    }
}
