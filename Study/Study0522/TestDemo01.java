package JavaStudy.Study.Study0522;

import java.util.Arrays;
import java.util.Random;

/**
 * @program: Java
 * @description: 排序
 * @author: Mx
 * @create: 2020-05-22 18:32
 * <p>
 * 1.基于比较的排序
 * 2.从小打到的排序
 * 3.稳定性  判断排序是不是稳定的
 * 如果一个排序是稳定排序，那么可以变为不稳定排序，反之不可以。
 * <p>
 * 如果排序是稳定的，在比较过程中没有跳跃式的交换
 **/
public class TestDemo01 {
    //直接插入排序
    //时间复杂度   最坏情况：O(n^2)       最好情况（有序情况）：O(n)
    //越有序越快
    //空间复杂度    O(1)
    //稳定排序
    public static void insertSort(int[] array) {
        int tmp = 0;
        for (int i = 1; i < array.length; i++) {//从第二个开始
            tmp = array[i];
            int j = i - 1;//前一个
            while (j >= 0) {
                if (array[j] > tmp) {//前一个大于后一个 的话  稳定  ；要是>=tmp 则不稳定
                    array[j + 1] = array[j];//将前一个的值赋值给后一个
                } else {
                    break;
                }
                j--;
            }
            array[j + 1] = tmp;//放入较大的那个值
        }
    }

    //希尔排序(缩小增量排序)
    //采用分组思想，组内进行插入排序  多次分组   每一次都比上一次块
    //不稳定排序
    public static void shell(int[] array, int drr) {
        int tmp = 0;
        for (int i = drr; i < array.length; i++) {//从第 drr 个开始
            tmp = array[i];
            int j = i - drr;//分组的第一个位置
            while (j >= 0) {
                if (array[j] > tmp) {//前一个大于后一个 的话  稳定  ；要是>=tmp 则不稳定
                    array[j + drr] = array[j];//将前一个的值赋值给后一个
                } else {
                    break;
                }
                j = j - drr;
            }
            array[j + drr] = tmp;//放入较大的那个值
        }
    }

    public static void shellSort(int[] array) {
        int[] drr = {5, 3, 1};//分量序列
        for (int i = 0; i < drr.length; i++) {
            shell(array, drr[i]);
        }
    }


    //选择排序
    //时间复杂度   O(n^2)
    //空间复杂度    O(1)
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {//第i个值与之后的所有值依次比较，最小的放到i的位置
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    //堆排序
//    public static void justDown(int[] array, int root, int len) {
//        int parent = root;
//        int child = parent * 2 + 1;
//        while (child < len) {
//            if (child + 1 < len && array[child] < array[child + 1]) {
//                child++;
//            }
//            if (array[child] > array[parent]) {
//                int tmp = array[child];
//                array[child] = array[parent];
//                array[parent] = tmp;
//                parent = child;
//                child = parent * 2 + 1;
//            }
//        }
//    }
//
//    public static void creatHeap(int[] array) {
//        for (int i = 0; i < array.length - 1; i++) {
//            justDown(array,);
//        }
//    }
//
//    public static void heapSort() {
//
//    }
//
//    public static void main(String[] args) {
//        int[] array = {10, 5, 8, 4, 1, 9};
//        selectSort(array);
//        System.out.println(Arrays.toString(array));
//    }

    //冒泡排序
    //时间复杂度   O(n^2)
    //空间复杂度    O(1)
    public static void bubbleSort(int[] array) {
        boolean flg = false;
        for (int i = 0; i < array.length - 1; i++) {//length-1趟数
            flg = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[i] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
                if (flg = false) {
                    return;//优化
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 8, 4, 1, 9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main3(String[] args) {
        int[] array = {10, 5, 8, 4, 1, 9};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main2(String[] args) {
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            //array[i] = random.nextInt(100000);
            ///array[i] = i;
        }
        long star = System.currentTimeMillis();
        System.out.println(star);
        insertSort(array);
        long end = System.currentTimeMillis();
        System.out.println(end);
    }

    public static void main1(String[] args) {
        int[] array = {10, 5, 8, 4, 1, 9};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
