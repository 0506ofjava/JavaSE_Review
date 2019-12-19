package singleton;

/**
 * @author yq
 * @description 懒汉模式：线程不安全<br>
 * @create 2019-20-00-04
 **/
public class SingletonTestTwo {
    private static SingletonTestTwo singletonTestTwo;

    public static SingletonTestTwo getSingletonTestTwo(){
        if(singletonTestTwo == null){
            singletonTestTwo=new SingletonTestTwo();
        }
        return singletonTestTwo;
    }
}
