package javaInitial;

/**
 * @author yq
 * @description
 * @create 2019-18-12-36
 */
public class JavaInitial extends JavaInitialFoo {
  static {
    System.out.println("子类静态代码块");
  }

  {
    System.out.println("子类非静态代码块");
  }

  public JavaInitial() {
    System.out.println("子类构造器");
  }

  public static void main(String[] args) {
    JavaInitial javaInitial = new JavaInitial();
  }
}

class JavaInitialFoo {
  static {
    System.out.println("父类静态代码块");
  }

  {
    System.out.println("父类非静态代码块");
  }

  public JavaInitialFoo() {
    System.out.println("父类构造器");
  }
}
