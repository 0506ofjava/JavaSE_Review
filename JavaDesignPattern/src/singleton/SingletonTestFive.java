package singleton;

/**
 * @author yq
 * @description 登记式/静态内部类
 * @create 2019-20-00-21
 **/
public class SingletonTestFive {
    private static class SingletonHolder{
        private static final SingletonTestFive INSTANCE=new SingletonTestFive();
    }

    public static final SingletonTestFive getSingletonTestFive(){

        return SingletonHolder.INSTANCE;
    }

}
