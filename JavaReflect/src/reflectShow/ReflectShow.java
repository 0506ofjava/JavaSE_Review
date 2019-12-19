package reflectShow;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author yq
 * @description
 * @create 2019-18-00-29
 */
public class ReflectShow {

  public void reflectShow() {
    /** 获取Class对象的三种方式 */
    TestObject testObject = new TestObject();
    Class clazz1 = testObject.getClass();
    Class clazz2 = TestObject.class;
    Class clazz3 = null;
    try {
      clazz3 = Class.forName("reflectShow.TestObject");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    /** 获取方法 */
    try {
      Method[] methods = clazz1.getMethods();
      for (Method method : methods) {
        System.out.println(method);
      }
      Method method = clazz2.getMethod("methodTest1", int.class);
      method.invoke(testObject, 1);
    } catch (Exception e) {
      e.printStackTrace();
    }

    /** 获取构造器 */
    Constructor[] constructors = clazz3.getDeclaredConstructors();
    for (Constructor constructor : constructors) {
      System.out.println(constructor);
    }
  }

  public static void main(String[] args) {
    ReflectShow reflectShow = new ReflectShow();

    reflectShow.reflectShow();
  }
}
