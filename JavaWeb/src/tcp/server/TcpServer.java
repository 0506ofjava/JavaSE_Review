package tcp.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yq
 * @description
 * @create 2019-12-11-49
 */
public class TcpServer {
  public static void main(String[] args) {
    try {
      // 创建套接字服务
      ServerSocket serverSocket = new ServerSocket(9999);
      // 监听端口，返回Socket对象
      System.out.println("服务器已启动，正在监听");
      Socket socket = serverSocket.accept();
      // 获取字节输入流
      InputStream inputStream = socket.getInputStream();
      // 转化为字符输入流
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      // 输入来自客户端的信息
      String str = null;
      while ((str = bufferedReader.readLine()) != null) {
        System.out.println(str);
      }

      bufferedReader.close();
      inputStreamReader.close();
      inputStream.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
