package singleton;

/**
 * @author yq
 * @description 双锁机制
 * @create 2019-20-00-16
 **/
public class SingletonTestFour {

    private volatile static SingletonTestFour singletonTestFour;

    public static SingletonTestFour getSingletonTestFour(){
        synchronized (SingletonTestFour.class){
            if(singletonTestFour==null){
                singletonTestFour=new SingletonTestFour();
            }
        }
        return singletonTestFour;
    }
}
