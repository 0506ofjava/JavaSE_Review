package MultiThreadFoundation;

/**
 * @author yq
 * @description
 * @create 2019-12-01-14
 */
public class MultiThreadFoundation {

  public static void main(String[] args) {
    //
    MyThread Mythread = new MyThread();
    for (int i = 0; i < 100; i++) {
        Thread thread=new Thread(Mythread,"Thread"+i);
        thread.start();
    }
  }
}
