package jdbcFoundation;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @author yq
 * @description
 * @create 2019-11-18-42
 */
public class JdbcUtil{

  public static Connection getConnection(){
    //    JdbcShow jdbcShow = new JdbcShow();
    //    String path =
    //
    // jdbcShow.getClass().getClassLoader().getResource("resources/jdbc.properties").getPath();
    //    System.out.println(path);
    //    File file=new File(path);
    //    FileInputStream inputStream=new FileInputStream(file);
    //    InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
    //    BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
    //
    //    String str=null;
    //    while ((str=bufferedReader.readLine())!=null){
    //      System.out.println(str);
    //    }

    //读取properties的API，只需要写名称即可，不需要加后缀
    ResourceBundle resourceBundle = ResourceBundle.getBundle("resources/jdbc");
    String className=resourceBundle.getString("jdbc.driver");
    String url = resourceBundle.getString("jdbc.url");
    String username = resourceBundle.getString("jdbc.username");
    String password = resourceBundle.getString("jdbc.password");
    Connection connection = null;
    try {
      //加载数据库驱动
      Class.forName(className);
      //
      connection = DriverManager.getConnection(url, username, password);
    } catch (ClassNotFoundException | SQLException classNotFound) {
      classNotFound.printStackTrace();
    }
    return connection;
  }
}
