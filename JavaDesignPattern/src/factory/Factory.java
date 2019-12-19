package factory;

/**
 * @author yq
 * @description
 * @create 2019-20-01-28
 */
public class Factory {

  Product product;

  public Product getProduct(String productName) {
    if ("productOne".equalsIgnoreCase(productName)) {
      product = new ProductOne();
      return product;
    }
    if ("productTwo".equalsIgnoreCase(productName)) {
      product = new ProductTwo();
      return product;
    }
    return null;
  }
}
