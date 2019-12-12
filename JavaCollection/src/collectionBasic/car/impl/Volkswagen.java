package collectionBasic.car.impl;

import collectionBasic.car.Car;

/**
 * @author yq
 * @description
 * @create 2019-11-12-41
 */
public class Volkswagen implements Car {
  public Volkswagen() {
    System.out.println("I'm Volkswagen");
  }

    @Override
    public String toString() {
        return "Volkswagen{}";
    }
}
