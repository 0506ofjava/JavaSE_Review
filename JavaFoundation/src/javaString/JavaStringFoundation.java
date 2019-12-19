package javaString;

import java.io.BufferedReader;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

/**
 * @author yq
 * @description
 * @create 2019-13-10-24
 */
public class JavaStringFoundation {
  /** 代码来源《编程思想》 String对象不可变 */
  public void immutableString() {
    String str1 = "howdy";
    String str2 = str1.toUpperCase();

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str1);

    /** 字符串重载机制 TODO：怎么评价字符串拼接的效率？String、StringBuilder、StringBuffer */
    // 使用+连接符拼接字符串，之前的方式是生成多个String对象进行拼接，如今默认使用StringBuilder
    String str3 = "hello" + "world";
    // 使用StringBuilder拼接字符串
    StringBuilder stringBuilder = new StringBuilder("hello");
    stringBuilder.append("world");
    String str4 = stringBuilder.toString();
    // 使用StringBuffer拼接字符串
    StringBuffer stringBuffer = new StringBuffer("hello");
    stringBuffer.append("world");
    String str5 = stringBuffer.toString();
    System.out.println(str3);
    System.out.println(str4);
    System.out.println(str5);
  }

  public void getByteShow() {
    String str1 = "hello";
    char[] chars = new char[5];
    str1.getChars(0, 5, chars, 0);
    for (char charEach : chars) {
      // 循环里面最好不要使用字符串连接符
      // String.valueOf()可以将char转化为String
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(charEach));
      stringBuilder.append("/");
      System.out.print(stringBuilder.toString());
    }
    System.out.println();
  }

  /** Java EE中控制用户登录等服务会用到 */
  public void containShow() {
    String str1 = "hello";
    String str2 = "HELLO world";
    boolean isContain = str2.contains(str1.toUpperCase());
    System.out.println(isContain);
  }

  /** 格式化输出：System.out.format()与System.out.printf() */
  public void formatShow() {
    int x = 5;
    double y = 5.332542;
    // printf与format基本一致
    System.out.printf("Row1: [%d %f]\n", x, y);
    System.out.format("Row1: [%d %f]\n", x, y);

    /** SimpleDateFormat常用占位字母 yyyy:年 MM：月 dd：日 hh：时 分钟：mm 秒：ss ww:周 F：星期 zz时区 */
    // simpleDateFormat对象把时间转化为字符串
    SimpleDateFormat simpleDateFormat =
        new SimpleDateFormat("时区：zz  第ww周 日期时间：yyyy-MM-dd hh:mm:ss");
    Date date = new Date();
    String currentDate = simpleDateFormat.format(date);
    System.out.println(currentDate);
    // simpleDateFormat对象还可以把字符串转化为时间
    try {
      Date dateByString = simpleDateFormat.parse(currentDate);
      System.out.println(dateByString);
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }

  /** 分词的方法： 1.String中含有的split方法 2.Scanner按类型分词 */
  public void splitShow() {
    String str = "22 85.5";
    String[] strings = str.split(" ");
    // 包装类可以实现字符串与数值型的转化
    System.out.format("age=%d\n", Integer.parseInt(strings[0]));
    System.out.format("grade=%2.2f", Double.parseDouble(strings[1]));
    System.out.println();

    // Scanner构造器可以接收任何类型的输入对象
    BufferedReader bufferedReader = new BufferedReader(new StringReader("age 22 grade 85.5"));
    Scanner scanner = new Scanner(bufferedReader);

    while (true){
      if(scanner.hasNext()){
        System.out.println(scanner.next());
      }else {
        return;
      }
    }
  }

  /**
   * 反编译工具:javap -c JavaStringFoundation
   *
   * @param args 无
   */
  public static void main(String[] args) {
    JavaStringFoundation javaStringFoundation = new JavaStringFoundation();
    javaStringFoundation.immutableString();
    javaStringFoundation.getByteShow();
    javaStringFoundation.containShow();
    javaStringFoundation.formatShow();
    javaStringFoundation.splitShow();
  }
}
