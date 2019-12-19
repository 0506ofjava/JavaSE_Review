package MultiThreadFoundation;

/**
 * @author yq
 * @description
 * @create 2019-12-01-14
 */
public class MultiThreadFoundation {

  public static void main(String[] args) {
    MultiThreadFoundation multiThreadFoundation = new MultiThreadFoundation();
    System.out.println("----创建线程----");
    multiThreadFoundation.createThreadShow();

    // 线程休眠1000ms
    /**
     * 尽管createThreadShow与proprietyShow方法上都已经增加synchronized关键字，但是只能保证这两个方法是同步的
     * 这两个方法与临近的主线程的输出语句是异步的
     * 为了保证大概率按顺序执行，这里选择让主线程休眠1s
     **/
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("----设置线程优先级----");
    multiThreadFoundation.proprietyShow();
  }

  /**
   * 主要展示线程的创建方式 简单来说，包含两种方式
   * 继承Thread类：直接调用start方法创建或作为Runnable的实现类参数传入Thread构造器创建
   * 实现Runnable接口：作为Thread构造器参数来创建多线程
   */
  public synchronized void createThreadShow() {
    // MyThread是Runnable接口的实现类，其实例对象作为参数传递给Thread构造器
    MyThreadByRunnable myThreadByRunnable = new MyThreadByRunnable();
    // MyThreadByInherit
    MyThreadByInherit myThreadByInherit = new MyThreadByInherit();

    Thread thread1 = new Thread(myThreadByInherit, "Thread_Inherit");
    Thread thread2 = new Thread(myThreadByRunnable, "Thread_Runnable");
    myThreadByInherit.setName("Thread_Inherit_direct");
    Thread.currentThread().setName("Thread_main");

    // start()方法只是说使得线程进入就绪状态，但是实际的运行顺序不一定为代码顺序
    thread1.start();
    thread2.start();
    myThreadByInherit.start();
    String str = Thread.currentThread().getName();
    System.out.println(str);
  }

    /**
     * 1.线程优先级：1～10
     * 2.
     */
  public synchronized void proprietyShow() {
    MyThreadByRunnable myThreadByRunnable = new MyThreadByRunnable();
    Thread[] threads = new Thread[11];
    for (int i = 1; i <= 10; i++) {
      threads[i] = new Thread(myThreadByRunnable, "Thread_" + i);
      threads[i].setPriority(i);
      threads[i].start();
    }
  }
}
