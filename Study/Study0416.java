package JavaStudy.Study;

import java.util.Arrays;

/**
 * @program: Java
 * @description: 二维数组
 * @author: Mx
 * @create: 2020-04-16 18:29
 **/

public class Study0416 {
//打印方式
    //    public static void main(String[] args) {
//        //规则二维数组
//        int[][] array = {{1, 2, 3}, {4, 5, 6}};
//        int[][] array2 = new int[][]{{1, 2, 3}, {4, 5, 6}};
//        int[][] array3 = new int[2][3];
//
//        //不规则二维数组
//    }


    //Java的二维数组   实际上是一个一维数组当中的每个元素是个数组
    //  Arrays.deepToString(array)
//    public static void main(String[] args) {
//        int[][] array = {{1, 2, 3}, {4, 5, 6}};
//        for (int[] tmp:array) {
//            for (int x:tmp){
//                System.out.print(x+" ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }

//        System.out.println(Arrays.deepToString(array));
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }

    // 不规则二维数组
    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[3];        //          [  值1 , 值2 , 值3 ]
        array[1] = new int[2];         //         [ 值1 , 值2  ]
        //Java 二维数组 行必须指定，列不能自动推导
        System.out.println(Arrays.deepToString(array));
    }
}