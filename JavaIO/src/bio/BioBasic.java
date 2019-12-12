package bio;

import java.io.*;

/**
 * @author yq
 * @description
 * @create 2019-12-21-29
 */
public class BioBasic {

  public void charStreamShow(String path) {

    File file = new File(path);
    FileInputStream fileInputStream = null;
    InputStreamReader inputStreamReader = null;
    BufferedReader bufferedReader = null;
    try {
      fileInputStream = new FileInputStream(file);
      inputStreamReader = new InputStreamReader(fileInputStream);
      bufferedReader = new BufferedReader(inputStreamReader);

      //使用BufferedReader时，尽量按此模板进行
      String str=null;
      while ((str = bufferedReader.readLine()) != null) {
        System.out.println(str);
      }

      //关闭资源，按先开后关的原则进行关闭
      bufferedReader.close();
      inputStreamReader.close();
      fileInputStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
      BioBasic bioBasic=new BioBasic();
      //获取当前项目的文件路径
      String path=bioBasic.getClass().getResource("/bio/text.txt").getPath();
      bioBasic.charStreamShow(path);
  }
}
