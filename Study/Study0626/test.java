package JavaStudy.Study.Study0626;

import java.io.*;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-26 09:30
 **/
public class test {
    public static void main1(String[] args) {
        /*
        1.如果文件不存在，会直接生成文件，写入
        2.如果存在，会进行覆盖写入
         */
        try (OutputStream os = new FileOutputStream("测试文件\\2.txt")) {
            //单字节写入
            /*os.write('H');
            os.write('i');
            os.write('\r');
            os.write('\n');
            os.write('a');*/
            byte[] buffer = new byte[8];
            buffer[0] = 'h';
            buffer[1] = 'e';
            buffer[2] = 'g';
            buffer[3] = 'e';
            buffer[4] = '3';
            os.write(buffer, 0, 5);
            os.flush();//写入一定要做此操作，强制要求把系统中缓冲数据，刷新到真正的硬件中
            //为了提升速度，很多Output类实现中，都会包含缓冲区
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main2(String[] args) throws FileNotFoundException {
        //带有中文字符
        try (InputStream is = new FileInputStream("测试文件\\中文.txt")) {
            byte[] buffer = new byte[1024];
            int n;
            //无法直接根据数据，百分之百确定数据的编码形式
            while ((n = is.read(buffer)) != -1) {
                for (int i = 0; i < n; i++) {
                    System.out.printf("|%d|%02x|%n", buffer[i], buffer[i]);
                }
                //假设buffer读取的中文，没有出现被拆段的形式
                String str = new String(buffer, 0, n, "UTF-8");
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //1.先有字节流
        try (InputStream is = new FileInputStream("测试文件\\中文.txt")) {
            //利用字节流为构造方法，创建字符流
            try (Reader reader = new InputStreamReader(is, "utf-8")) {
                //读取单位变成char   已经完成字符集解析
                // 单个读取 int c = reader.read();
                char[] buffer = new char[1024];
                int n;
                while ((n = reader.read(buffer)) != -1) {
                    for (int i = 0; i < n; i++) {
                        System.out.println(buffer[i]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
