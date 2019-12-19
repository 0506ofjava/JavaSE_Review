package singleton;

/**
 * @author yq
 * @description
 * @create 2019-19-23-59
 */
public class SingletonShow {

  public static void main(String[] args) {
    SingletonTestOne singletonTestOne=SingletonTestOne.getSingletonTest();
    SingletonTestOne singletonTestOne1=SingletonTestOne.getSingletonTest();

    SingletonTestTwo singletonTestTwo=SingletonTestTwo.getSingletonTestTwo();
    SingletonTestTwo singletonTestTwo1=SingletonTestTwo.getSingletonTestTwo();

    SingletonTestThree singletonTestThree=SingletonTestThree.getSingletonTestThree();
    SingletonTestThree singletonTestThree1=SingletonTestThree.getSingletonTestThree();

    SingletonTestFour singletonTestFour=SingletonTestFour.getSingletonTestFour();
    SingletonTestFour singletonTestFour1=SingletonTestFour.getSingletonTestFour();

    SingletonTestFive singletonTestFive=SingletonTestFive.getSingletonTestFive();
    SingletonTestFive singletonTestFive1=SingletonTestFive.getSingletonTestFive();

    SingletonTestFive singletonTestSix=SingletonTestSix.getSingtonTestSix();
    SingletonTestFive singletonTestSix1=SingletonTestSix.getSingtonTestSix();

    System.out.println(singletonTestOne);
    System.out.println(singletonTestOne1);
    System.out.println(singletonTestTwo);
    System.out.println(singletonTestTwo1);
    System.out.println(singletonTestThree);
    System.out.println(singletonTestThree1);
    System.out.println(singletonTestFour);
    System.out.println(singletonTestFour1);
    System.out.println(singletonTestFive);
    System.out.println(singletonTestFive1);
    System.out.println(singletonTestSix);
    System.out.println(singletonTestSix1);
  }
}
