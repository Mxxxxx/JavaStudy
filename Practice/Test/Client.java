package JavaStudy.Practice.Test;

import JavaStudy.Study.Study0628.UDP.echo.Server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;
import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-29 15:31
 **/
public class Client {
    public static final String SERVER_HOST = "127.0.0.1";

    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            System.out.printf("%s: DEBUG: 已经创建好 socket 对象%n", new Date());
            System.out.print("echo> ");
            while (stdinScanner.hasNextLine()) {
                String request = stdinScanner.nextLine();
                System.out.printf("%s: DEBUG: 读取用户的输入是: %s%n", new Date(), request);
                if (request.equalsIgnoreCase("quit")) {
                    break;
                }

                // 准备发送
                byte[] sendBuffer = request.getBytes("UTF-8");
                // 绑定对方的 ip
                // 绑定对方的 port
                // 127.0.0.1:8260
                DatagramPacket sendPacket = new DatagramPacket(
                        sendBuffer, sendBuffer.length,
                        InetAddress.getByName(SERVER_HOST),
                        Server.PORT);

                System.out.printf("%s: DEBUG: 准备发送请求 ...%n", new Date());
                clientSocket.send(sendPacket);
                System.out.printf("%s: DEBUG: 请求发送成功%n", new Date());

                // 等待响应
                byte[] receiveBuffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, 0, receiveBuffer.length);

                System.out.printf("%s: DEBUG: 准备接收响应 ...%n", new Date());
                clientSocket.receive(receivePacket);
                System.out.printf("%s: DEBUG: 接收响应成功%n", new Date());

                // 转成字符形式
                String response = new String(receiveBuffer, 0, receivePacket.getLength(), "UTF-8");
                System.out.println("echo service 应答: " + response);
                System.out.print("echo> ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
