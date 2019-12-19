package javaOOP.javaExtend;

/**
 * @author yq
 * @description 展示了this与super的用法
 * @create 2019-18-01-28
 */
public class CarExtend extends Car {
  public int intTest = 2;

  /**
   * 关于继承：
   * 1.子类成员（变量与方法）与父类同名时，优先加载子类
   * 2.使用super可以调用父类的属性和方法
   * 3.重写：子类与父类方法之间的关系，运行时多态
   *   重载：同类不同方法之间的关系，编译时多态
   */
  @Override
  public void getTest() {
    System.out.println("子类的intTest:"+intTest);
    //由于子类重写了父类的方法，故通过super才可以调用到父类的成员
    System.out.println("父类的intTest:"+super.intTest);
    System.out.println("intTest2:"+intTest2);
    System.out.println("我是子类");
    System.out.println();
  }

  public void getInt(int intTest){
    intTest=intTest;
  }

  public void getIntByThis(int intTest){
    this.intTest=intTest;
  }

  public void getSuperClassName(){
    //得到的是子类的全限定名
    System.out.println(this.getClass().getName());
    //得到父类的全限定名
    System.out.println(this.getClass().getSuperclass().getName());
  }

  public static void main(String[] args) {
    CarExtend carExtend=new CarExtend();
    carExtend.getTest();
    carExtend.getSuperClassName();
    /**
     * 未使用this，则成员变量intTest的值没有改变
     */
    carExtend.getInt(4);
    System.out.println("未使用this的值："+carExtend.intTest);

    /**
     * 使用this之后，成员变量的值则改变
     */
    carExtend.getIntByThis(5);
    System.out.println("使用this之后的值："+carExtend.intTest);
  }
}

/**
 * 同一个java文件中可以包含多个类，但只有一个public类
 */
class Car {
  public int intTest=1;

  public int intTest2=3;

  public void getTest() {
    System.out.println("我是父类");
  }
}
