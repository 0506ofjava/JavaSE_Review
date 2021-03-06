package jdbcFoundation;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @author yq
 * @description
 * @create 2019-11-21-09
 */
public class JdbcShow {
  private Connection connection = JdbcUtil.getConnection();

  public void statementShow() {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("resources/sql");
    String sql = resourceBundle.getString("selectAll");

    try {
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery(sql);
      while (resultSet.next()) {
        System.out.print("username:"+resultSet.getString("username"));
        System.out.println("  password:"+resultSet.getString("password"));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public void preparedStatementShow() {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("resources/sql");
    String sql = resourceBundle.getString("selectWithParam");

    try {
      PreparedStatement statement = connection.prepareStatement(sql);
      statement.setString(1,"java0506");
      ResultSet resultSet = statement.executeQuery();
      while (resultSet.next()) {
        System.out.print("username:"+resultSet.getString("username"));
        System.out.print("  password:"+resultSet.getString("password"));
        System.out.println("  email:"+resultSet.getObject("email"));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }


  public void transactionShow(){
    try {
      int transactionIsolation=connection.getTransactionIsolation();
      System.out.println("事务隔离级别为："+transactionIsolation);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    JdbcShow jdbcShow = new JdbcShow();
    System.out.println("---不带参数的情况---");
    jdbcShow.statementShow();
    System.out.println("---带参数的情况---");
    jdbcShow.preparedStatementShow();
    System.out.println("---事务隔离级别---");
    jdbcShow.transactionShow();
  }
}
