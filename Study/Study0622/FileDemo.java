package JavaStudy.Study.Study0622;

import java.io.File;
import java.io.IOException;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-22 20:30
 **/
public class FileDemo {
    public static void main(String[] args) throws IOException {
//        String path = "F:\\IDEA\\Bit-Study\\测试文件\\1.txt";
//        //构建文件对象
//        File file = new File(path);//路径对应的文件，但文件可能实际不存在
//        //常见属性
//
//        //文件存在，并且是普通文件才会返回true
//        boolean isFile = file.isFile();
//        System.out.println(isFile);
//
//        //文件存在&&是文件夹
//        boolean isDirectory = file.isDirectory();
//        System.out.println(isDirectory);
//        System.out.println(file.isAbsolute());
//        System.out.println(file.isHidden());
//        System.out.println(file.exists());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getName());
//        System.out.println(file.getPath());
//        System.out.println(file.getParent());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.canExecute());
//        System.out.println(" =============================");

        String path1 = "F:\\IDEA\\Bit-Study\\测试文件\\2";
        File file1 = new File(path1);
        file1.mkdir();
        System.out.println(file1.exists());
    }
}
