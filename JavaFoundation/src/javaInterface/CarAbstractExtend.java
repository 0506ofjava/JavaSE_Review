package javaInterface;

/**
 * @author yq
 * @description
 * @create 2019-18-11-54
 */
public class CarAbstractExtend extends CarAbstract {

  public CarAbstractExtend() {
    System.out.println("我是抽象类的子类");
  }

  @Override
  public void getEngine() {}


  public static void main(String[] args) {
    CarAbstractExtend carAbstractExtend=new CarAbstractExtend();
  }
}
