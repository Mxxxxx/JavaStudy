package JavaStudy.Practice.practice0630;

import JavaStudy.Study.Study0629.echo.Logger;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-30 15:09
 **/
public class Server {
    public static final int SERVER_PORT = 7620;

    public static void main(String[] args) {
        // 1. 开店（创建 TCP 的 服务端 socket —— ServerSocket）
        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            // 2. 等着客户打来订餐电话
            Socket socket = serverSocket.accept();

            // 4. 从 Socket 中获取 InputStream 作为输入流，获取 OutputStream 作为输出流
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            Scanner scanner = new Scanner(inputStream, "UTF-8");
            PrintWriter writer = new PrintWriter(
                    new OutputStreamWriter(outputStream, "UTF-8")
            );

            String request = scanner.nextLine();

            String response = request;

            writer.printf("%s\r\n", response);

            writer.flush();
            Logger.debug("发送响应成功");


            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
