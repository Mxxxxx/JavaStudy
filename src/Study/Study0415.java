package Study;

import java.util.Arrays;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-15 18:39
 **/
public class Study0415 {
//    public static void copyArray(int[] array){
//      int[] a=new int[array.length];
//        for (int i = 0; i < a.length; i++) {
//            a[i]=array[i];
//        }
//    }
//    public static void main(String[] args) {
//        int[] array={1,2,3,4,5};
//        copyArray(array);
//
//        System.out.println(Arrays.toString(array));
//    }

    //数组的拷贝
    /*2.Arrays.copyOf(arr,arr.length)
     * 3.System.arraycopy
     * 4.clone()   //产生了这个对象的副本   是Object的克隆方法
     *Object：所有类的 父类
     * 都是浅拷贝
     *
     * 浅拷贝：
     * 深拷贝：如果通过array2修改自己的元素，那么不会影响到array1.
     *  */
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};
//        //  Arrays.copyOf(arr,arr.length);
//        //  int[] ret=new int[arr.length];
//        // System.arraycopy(arr,0,ret,0,arr.length);
//        // System.out.println(Arrays.toString(ret));
//        int[] ret=arr.clone();
//    }


    //数组最大值
//    public static int max(int[] array){
//        int max=array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (max<array[i]){
//                max=array[i];
//            }
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int[] array={1,2,3,4,5,6};
//        System.out.println(max(array));
//    }

    //顺序查找
//    public static int find(int[] array,int num){
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]==num){
//
//            }
//        return i;
//        }
//    }
//    public static void main(String[] args) {
//        int[] array={2,1,5,6,7,4,1,8};
//        System.out.println(find(array, 7));
//    }

    //二分查找
    //有序序列
    public static int find(int[] array, int num) {
        int left = 0;
        int right = array.length - 1;
        while (left<right) {
            int mid = (left + right);
            if (num < array[mid]) {
                right=mid-1;
            } else if (num > array[mid]) {
                left=mid+1;
            } else {
                return mid;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(find(array, 5));
    }


//    public static void main(String[] args) {
//        int[] array={14,22,43,14,5,6};
//     //   int[] ret=Arrays.copyOfRange(array,2,5);
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//    }
    //Arrays工具类中常用方法
    /*
    toString()  binarySearch()    copyOf()

     * */

// 判断数组是否是升序
//    public static boolean isUp(int[] array){
//        for (int i = 0; i < array.length-1; i++) {
//            if (array[i]>array[i+1]){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        int[] array={1,2,3,4,5};
//        System.out.println(isUp(array));
//    }


    //冒泡排序
//    public static void bubble(int[] array) {
//        int tmp = 0;
//        boolean flg = true; //优化
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - i - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
//                    flg=false;
//                }
//            }
//            if (flg==true){
//                break;
//            }
//        }
//    }

//    public static void main(String[] args) {
//        int[] array = {1, 2, 5, 4, 7, 9, 8};
//        bubble(array);
//        System.out.println(Arrays.toString(array));
//
//    }

    //数组逆序
//    public static void rev(int[] array) {
//        int tmp = 0;
//        int left = 0;
//        int right = array.length - 1;
//        while (left < right) {
//            tmp = array[left];
//            array[left] = array[right];
//            array[right] = tmp;
//            left++;
//            right--;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5};
//        rev(array);
//        System.out.println(Arrays.toString(array));
//    }

    //数组奇偶排

//    public static void pai(int[] array) {
//        int l = 0;
//        int r = array.length - 1;
//        while (l < r) {
//            while (l < r && array[l] % 2 == 0) {
//                l++;
//            }
//            while (l < r && array[r] % 2 != 0) {
//                r--;
//            }
//            if (l < r) {
//                int tmp = array[l];
//                array[l] = array[r];
//                array[r] = tmp;
//            }
//        }
//    }
//
//    public static void main(String[] args) {

//    }
}

