package MultiThreadBasic;

/**
 * @author yq
 * @description
 * @create 2019-12-01-14
 */
public class MultiThreadBasic {

  public static void main(String[] args) {
    //
    MyThread Mythread = new MyThread();
    for (int i = 0; i < 100; i++) {
        Thread thread=new Thread(Mythread,"Thread"+i);
        thread.start();
    }
  }
}
