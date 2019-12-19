package bio;

import java.io.*;

/**
 * @author yq
 * @description
 * @create 2019-12-21-29
 */
public class BioFoundation {

  public void charStreamShow(String path) {

    File file = new File(path);
    // TODO：局部变量是否需要立即初始化，性能影响如何？
    FileInputStream fileInputStream;
    InputStreamReader inputStreamReader;
    BufferedReader bufferedReader;
    try {
      fileInputStream = new FileInputStream(file);
      inputStreamReader = new InputStreamReader(fileInputStream);
      bufferedReader = new BufferedReader(inputStreamReader);

      // 使用BufferedReader时，尽量按此模板进行
      String str = null;
      while ((str = bufferedReader.readLine()) != null) {
        System.out.println(str);
      }

      // 关闭资源，按先开后关的原则进行关闭
      bufferedReader.close();
      inputStreamReader.close();
      fileInputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    BioFoundation bioFoundation = new BioFoundation();
    /**
     * 获取文件的url
     * 两种方式：Class.getResource()和ClassLoader.getResource()
     * TODO：Class加载需要带上/，而ClassLoader加载不需要，为什么？
     */
    String path = bioFoundation.getClass().getResource("/bio/text.txt").getPath();
    String str = bioFoundation.getClass().getClassLoader().getResource("bio/text.txt").getPath();
    System.out.println(path);
    System.out.println(str);

    System.out.println("以下为文件展示内容");
    bioFoundation.charStreamShow(path);
  }
}
