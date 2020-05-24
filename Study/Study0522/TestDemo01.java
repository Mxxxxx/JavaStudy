package JavaStudy.Study.Study0522;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

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
    public static void justDown(int[] array, int root, int len) {
        int parent = root;
        int child = parent * 2 + 1;
        while (child < len) {//有左孩子进入

            if (child + 1 < len && array[child] < array[child + 1]) {//有右孩子，且找出其左右孩子节点最大值
                child++;
            }
            if (array[child] > array[parent]) { //将最大值给头节点
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;//向下移动
                child = parent * 2 + 1;
            } else {
                break;
            }
        }
    }

    public static void creatHeap(int[] array) {//堆建立
        for (int i = (array.length - 1 - 1) / 2; i >= 0; i--) {//拿根节点
            justDown(array, i, array.length);
        }
    }

    public static void heapSort(int[] array) {
        creatHeap(array);
        int end = array.length - 1;//最后一个开始
        while (end > 0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            justDown(array, 0, end);
            end--;
        }
    }

    public static void main5(String[] args) {
        int[] array = {10, 5, 8, 4, 1, 9};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }


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

    public static void main4(String[] args) {
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


    //快速排序
    //快排要块，如果每次划分序列都可以均匀的划分，那么效率最好
    //时间复杂度： nlong(n)                  最坏情况  1 2 3 4 5/ 5 4 3 2 1  O(n^2)
    //空间复杂度：
    //稳定性：不稳定
    //找基准
    public static int parition(int[] array, int low, int high) {
        int tmp = array[low];//每次第一个为基准
        while (low < high) {
            while (low < high && array[high] >= tmp) {//条件low<high,预防都比tmp小或者大
                high--;
            }//跳出比基准小的
            array[low] = array[high];//右边小的放左边

            while (low < high && array[low] <= tmp) {
                low++;
            }//跳出比基准大的
            array[high] = array[low];//左边大的放右边
        }//跳出时说明已经相遇了，即基准位置找到，即左边都比基准小，右边都比基准大。
        array[low] = tmp;//或者 high = tmp都可以，因为已经相遇，将基准的值tmp给相遇的位置。
        return low;//返回基准的下标
    }

    public static void insert_Sort(int[] array, int start, int end) {
        int tmp = 0;
        for (int i = start + 1; i < end; i++) {//从第二个开始
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

    //三数取中
    public static void three_num_mid(int[] array, int left, int right) {
        //效果：array[mid] <= array[left] <= array[right]
        int mid = (left + right) / 2;
        if (array[mid] > array[left]) {
            int tmp = array[mid];
            array[mid] = array[left];
            array[left] = tmp;
        }
        if (array[left] > array[right]) {
            int tmp = array[right];
            array[right] = array[left];
            array[left] = tmp;
        }
        if (array[mid] > array[right]) {
            int tmp = array[mid];
            array[mid] = array[right];
            array[right] = tmp;
        }
    }

    public static void quick(int[] array, int left, int right) {
        if (left >= right) {
            return;//递归终止条件
        }
        //优化：当待排序序列数据个数<=100时，用直接插入排序
        if (right - left + 1 <= 100) {
            insert_Sort(array, left, right);
            return;
        }
        three_num_mid(array, left, right);
        int par = parition(array, left, right);//基准
        quick(array, left, par - 1);//基准左边部分递归
        quick(array, par + 1, right);//基准右边部分递归
    }

    public static void quickSort(int[] array) {
        quick(array, 0, array.length);
    }

    //非递归实现
    public static void quickSortl(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int left = 0;
        int right = array.length - 1;
        int par = parition(array, left, right);//基准
        if (par > left + 1) {//左边有两个元素以上
            stack.push(left);
            stack.push(par - 1);
        }
        if (par < right - 1) {//右边
            stack.push(par + 1);
            stack.push(right);
        }
        while (!stack.empty()) {
            right = stack.pop();
            left = stack.pop();
            par = parition(array, left, right);
            if (par > left + 1) {//左边有两个元素以上
                stack.push(left);
                stack.push(par - 1);
            }
            if (par < right - 1) {//右边
                stack.push(par + 1);
                stack.push(right);
            }

        }
    }

    //归并排序
    //时间复杂度 O( nlog(n) )
    //空间复杂度 O(n)
    //稳定性：稳定
    //分解成一个个有序序列
    public static void merge(int[] array, int low, int mid, int high) {
        //归并
        int len = high - low + 1;
        int[] ret = new int[len];
        int s1 = low;
        int i = 0;//用来表示ret数组下标
        int s2 = mid + 1;
        while (s1 <= mid && s1 <= high) {//两段都有数据
            if (array[s1] <= array[s2]) {
                ret[i++] = array[s1++];
            } else {
                ret[i++] = array[s2++];
            }
        }

        while (s1 <= mid) {//第一个段有
            ret[i++] = array[s1++];
        }
        while ((s2 <= high)) {
            ret[i++] = array[s2++];
        }
        for (int i1 = 0; i1 < ret.length; i1++) {
            array[i1 + low] = ret[i1];
        }
    }

    public static void mergeSortInternal(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) >>> 1;
        mergeSortInternal(array, low, mid);
        mergeSortInternal(array, mid + 1, high);//全部分解成一个个元素

        merge(array, low, mid, high);//归并方法
    }

    public static void mergeSort(int[] array) {
        mergeSortInternal(array, 0, array.length - 1);
    }

    public static void main(String[] args) {

    }
}












