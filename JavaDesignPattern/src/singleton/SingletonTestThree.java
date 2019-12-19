package singleton;

/**
 * @author yq
 * @description 懒汉模式：线程安全
 * @create 2019-20-00-14
 **/
public class SingletonTestThree {
    private static SingletonTestThree singletonTestThree;

    public static synchronized SingletonTestThree getSingletonTestThree(){
        if(singletonTestThree==null){
            singletonTestThree=new SingletonTestThree();
        }
        return singletonTestThree;
    }
}
