package MultiThreadFoundation;

/**
 * @author yq
 * @description
 * @create 2019-12-23-41
 */
public class MyThreadByInherit extends Thread {

  @Override
  public void run() {
    // Thread类包含Runnable接口，故MyThreadByInherit也是Runnable接口的实现类
    String str = Thread.currentThread().getName();
    System.out.println(str);
  }
}
