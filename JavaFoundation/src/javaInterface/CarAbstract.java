package javaInterface;

/**
 * @author yq
 * @description 抽象类更倾向于作为公共类，而接口主要用于维护、添加方法
 * @create 2019-18-11-14
 */
public abstract class CarAbstract implements CarInterface {
  /** 抽象类与普通类的成员变量没有什么区别 */
  String stringTest;

  /** 既可以有普通方法，也可以有抽象方法 */
  public CarAbstract() {
    System.out.println("我是抽象类");
  }

  public abstract void getEngine();

  @Override
  public void getSteel() {}
}
