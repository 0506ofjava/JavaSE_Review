package MultiThreadFoundation;

/**
 * @author yq
 * @description
 * @create 2019-12-01-15
 */
public class MyThreadByRunnable implements Runnable {
  @Override
  public void run() {
    String str = Thread.currentThread().getName();
    System.out.println(str);
  }
}
