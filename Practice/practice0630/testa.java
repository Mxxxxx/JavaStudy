package JavaStudy.Practice.practice0630;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-07-02 16:32
 **/
public class testa {
    public static String host = "www.baidu.com";
    public static int port = 80;

    public static void main(String[] args) {
        try (Socket socket = new Socket(host, port)) {
            String request = "GET /s?wd=java HTTP/1.0\r\nHost: www.baidu.com\r\n\r\n";

            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
            printWriter.print(request);
            printWriter.flush();

            Scanner scanner = new Scanner(socket.getInputStream(), "UTF-8");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
