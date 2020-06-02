package JavaStudy.Practice;

import java.util.Arrays;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-02 10:17
 **/
public class practice0602 {
    //直接插入排序
    /*
    1.时间复杂度： 最坏情况 O(n^2)  最好情况 O(n)
     越有序也越快

     2.空间复杂度：O(1)

     是稳定的排序
     */
    public static void zhiJieChaRu(int[] array) {
        int tmp = 0;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];//将i值放入tmp零时位置
            int j = i - 1;
            while (j >= 0) {
                if (array[j] < tmp) {
                    //array[j + 1] = tmp;
                    //如果i值大于j值，则不改变位置直接跳出本次循环
                    break;
                }
                if (array[j] > tmp) {
                    array[i] = array[j];//如果j值大于i值，则将i值变为j值
                }
                j--;
            }
            array[j + 1] = tmp;//给0位置赋最小的那个值
        }
    }


    //希尔排序
    public static void shell(int[] array, int gap) {
        int tmp = 0;
        for (int i = gap; i < array.length; i++) {
            tmp = array[i];//将i值放入tmp零时位置
            int j = i - gap;
            while (j >= 0) {
                if (array[j] < tmp) {
                    //array[j + 1] = tmp;
                    //如果i值大于j值，则不改变位置直接跳出本次循环
                    break;
                }
                if (array[j] > tmp) {
                    array[i] = array[j];//如果j值大于i值，则将i值变为j值
                }
                j = j - gap;
            }
            array[j + gap] = tmp;//给0位置赋最小的那个值
        }
    }

    public static void shellSort(int[] array) {
        int[] drr = {5, 3, 1};
        for (int i = 0; i < drr.length; i++) {
            shell(array, drr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 1, 2};
        //zhiJieChaRu(array);
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }


}
