package JavaStudy.Study.Study0624;

import com.sun.javafx.css.PseudoClassState;

import java.io.File;
import java.io.InputStream;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-24 19:41
 **/
public class ScanDir {
    public static void main(String[] args) {
        File root = new File("测试文件");
        scanDir(0, root);
    }

    //node代表目录
    private static void scanDir(int level, File node) {
        //先打节点绝对路径
        for (int i = 0; i < level; i++) {
            System.out.print("      ");
        }
        System.out.println(node.getAbsolutePath() + "\\");
        File[] children = node.listFiles();
        if (children == null) {
            return;
        }
        for (File child : children) {
            if (child.isDirectory()) {//判断是否是文件夹
                scanDir(level + 1, child);//文件夹再次进入
            } else if (child.isFile()) {//如果是文件，直接打印
                System.out.println(child.getAbsolutePath());
            }
        }
    }
}
