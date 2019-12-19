package javaInterface;

/**
 * @author yq
 */
public interface CarInterface {
    /**
     * 1.接口中的变量默认修饰符为：public static final
     * 2.必须初始化
     */
    public static final String CAR_STRING_TEST = "hello";

    /**
     * 1.接口方法默认修饰符为:public abstract
     * 2.不能被其他修饰符修饰
     */
    public abstract void getSteel();
}
