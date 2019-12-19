package singleton;

public enum SingletonTestSix {
    /**
     * 枚举单例
     */
    INSTANCE;

    private SingletonTestFive singletonTestFive;

    private SingletonTestSix(){
        singletonTestFive=new SingletonTestFive();
    }

    public SingletonTestFive getSingletonTestFive(){
        return singletonTestFive;
    };

    public static SingletonTestFive getSingtonTestSix(){
        return SingletonTestSix.INSTANCE.getSingletonTestFive();
    }

    public void whateverMethod(){}

}
