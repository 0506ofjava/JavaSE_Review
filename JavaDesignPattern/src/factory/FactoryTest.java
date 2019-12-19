package factory;

import java.io.FileInputStream;

/**
 * @author yq
 * @description
 * @create 2019-20-01-39
 */
public class FactoryTest {
  public static void main(String[] args) {
    Factory factory = new Factory();
    Product product1 = factory.getProduct("productOne");
    System.out.println(product1);
    Product product2 = factory.getProduct("productTwo");
    System.out.println(product2);
  }
}
