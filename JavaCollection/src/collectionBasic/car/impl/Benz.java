package collectionBasic.car.impl;

import collectionBasic.car.Car;

/**
 * @author yq
 * @description
 * @create 2019-11-12-39
 */
public class Benz implements Car {
  public Benz() {
    System.out.println("I'm Benz");
  }

    @Override
    public String toString() {
        return "Benz{}";
    }
}
