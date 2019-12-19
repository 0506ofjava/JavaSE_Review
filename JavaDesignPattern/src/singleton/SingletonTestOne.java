package singleton;

/**
 * @author yq
 * @description 饿汉模式
 * @create 2019-20-00-00
 **/
public class SingletonTestOne {
    private static SingletonTestOne singletonTestOne=new SingletonTestOne();

    public static SingletonTestOne getSingletonTest(){
        return singletonTestOne;
    }
}
