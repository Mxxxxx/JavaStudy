package JavaStudy.Study.Study0624;

import java.io.File;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-24 18:39
 **/
public class FileDemo {
    public static void main(String[] args) {
       /* File file = new File("F:\\IDEA\\Bit-Study\\测试文件\\a.txt");

        //模拟文件重命名
        File dest = new File("F:\\IDEA\\Bit-Study\\测试文件\\b.txt");
        boolean b = file.renameTo(dest);
        System.out.println(b);*/

        //模拟粘贴剪切
       /* File dest = new File("F:\\IDEA\\Bit-Study\\测试文件\\b.txt");
        File file = new File("Bit-Study\\");
        dest.renameTo(file);*/

        //删除  只能删除树上的叶子节点
        /*File file = new File("测试文件\\1");
        File file1 = new File("测试文件\\1.txt");
        file.delete();
        file1.delete();*/

        //遍历
        File file = new File("F:\\IDEA\\Bit-Study\\测试文件");
        File[] a = file.listFiles();
//        for (File f : a) {
//            System.out.println(f.getAbsolutePath());
//        }
        String[] s = file.list();
        for (String f : s) {
            System.out.println(f);
        }
    }
}
