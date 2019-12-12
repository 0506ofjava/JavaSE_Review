package collectionBasic;

import collectionBasic.car.Car;
import collectionBasic.car.impl.Benz;
import collectionBasic.car.impl.Bmw;
import collectionBasic.car.impl.Volkswagen;

import java.util.*;

/**
 * @author yq
 * @description show some basic usage
 * @create 2019-11-12-24
 */
public class JavaCollectionTest {
  private List<Car> arrayList;
  private List<Car> linkedList;
  private List<Car> vector;
  private Set<Car> hashSet;
  private Set<Car> treeSet;
  private Map<String, Car> hashMap;
  private Map<String, Car> hashtable;
  private Map<String, Car> treeMap;
  private Car benz = new Benz();
  private Car volkswagen = new Volkswagen();
  private Car bwm = new Bmw();

  public JavaCollectionTest() {
    System.out.println("I'm collectionBasic.JavaCollectionTest");
  }

  public void arrayListShow() {
    System.out.println("---创建集合对象---");
    arrayList = new ArrayList<>();

    // arrayList用法示例
    // 元素添加
    arrayList.add(benz);
    arrayList.add(volkswagen);
    arrayList.add(bwm);
    // 元素获取
    Car car0 = arrayList.get(0);
    Car car1 = arrayList.get(1);
    Car car3 = arrayList.get(2);
    // 元素遍历：foreach
    for (Car car : arrayList) {
      System.out.println(car);
    }
    // 元素遍历：iterator
    System.out.println("---iterator遍历集合---");
    Iterator<Car> it = arrayList.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  public void linkedListShow() {
    System.out.println("---创建集合对象---");
    // 如果要使用list接口之外的特定方法，就不可以向上转型
    linkedList = new LinkedList<>();

    // arrayList用法示例
    // 元素添加
    System.out.println("---add方法添加元素---");
    linkedList.add(benz);
    linkedList.add(volkswagen);
    linkedList.add(bwm);
    // 元素获取
    System.out.println("---get方法取出元素---");
    Car car0 = linkedList.get(0);
    Car car1 = linkedList.get(1);
    Car car2 = linkedList.get(2);
    // 元素遍历：foreach
    System.out.println("---foreach遍历集合---");
    for (Car car : linkedList) {
      System.out.println(car);
    }
    // 元素遍历：iterator
    System.out.println("---iterator遍历集合---");
    Iterator<Car> it = linkedList.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  public void hashSetShow(){
      hashSet=new HashSet<>();




  }

  /** hashMap的基本用法 */
  public void hashMapShow() {
    // 创建hashMap对象
    hashMap = new HashMap<>();
    // 添加元素
    hashMap.put("benz", benz);
    hashMap.put("volkswagen", volkswagen);
    hashMap.put("bwm", bwm);

    Car car0 = hashMap.get("benz");
    Car car1 = hashMap.get("volkswagen");
    Car car2 = hashMap.get("bwm");
    System.out.println("get方法取值");
    System.out.println(car0);
    System.out.println(car1);
    System.out.println(car2);

    System.out.println("遍历hashMap的value值");
    for (Car car : hashMap.values()) {
      System.out.println(car);
    }

    System.out.println("遍历hashMap的key值");
    for (String key : hashMap.keySet()) {
      System.out.println(key);
    }
  }

  public static void main(String[] args) {
    System.out.println("---List用法展示---");
    JavaCollectionTest javaCollectionTest = new JavaCollectionTest();
    System.out.println("---arrayList用法展示---");
    javaCollectionTest.arrayListShow();
    System.out.println("---linkedList用法展示---");
    javaCollectionTest.linkedListShow();
    System.out.println("---hashMap用法展示---");
    javaCollectionTest.hashMapShow();
  }
}
