package tcp.client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author yq
 * @description
 * @create 2019-12-12-30
 */
public class TcpClient {

  public static void main(String[] args) {
    try {
      // 建立TCP连接
      Socket socket = new Socket("localhost", 9999);
      System.out.println("已连接至服务器");
      // 获取字节输出流
      OutputStream outputStream = socket.getOutputStream();
      // 获取字符输出流
      PrintWriter printWriter = new PrintWriter(outputStream);
      // 向流中写入内容
      String str = "HELLO , I'M CLIENT";

/*
 *    printWriter.println(str);
 *    TODO:为什么此处使用println无法给客户端输出结果，但使用write却可以
 */

      printWriter.write(str);
      printWriter.flush();
      socket.shutdownOutput();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
