package JavaStudy.Study.Study0521;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Arrays;

/**
 * @program: Java
 * @description:堆
 * @author: Mx
 * 默认小根堆
 * 父亲节点下标 n   左 2n+1   右 2n+2
 * @create: 2020-05-21 18:28
 **/
public class TestHeap {
    public int[] elem;
    public int usedSize;

    public void TestHeap() {
        this.elem = new int[10];
    }

    //root代表每颗子树的开始，len是结束位置
    //一次 log（n）
    public void adjustDown(int root, int len) {
        int parent = root;
        int child = parent * 2 + 1;
        while (child < len) {//肯定有左孩子
            //判断是否有右孩子
            if (child + 1 < len) {
                //找到左右孩子的最大值，用child保存最大
                if (this.elem[child] < this.elem[child + 1]) {
                    child++;
                }
            } //此时child最大
            //最大值与根节点比较大小
            if (this.elem[child] > this.elem[parent]) {
                //孩子节点大于根节点交换
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[child] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }

    //O（N）
    public void creatHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        //i代表每颗子树的根节点下标       (n-1)/2
        for (int i = (this.usedSize - 1 - 1) / 2; i >= 0; i--) {
            adjustDown(i, this.usedSize);
        }
    }

    public void show() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i]);
        }
    }


    //向上调整
    public void adjustUp(int child) {//数组最后一个位置
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (this.elem[child] > this.elem[parent]) {//子节点大于头节点 进行交换
                int tmp = this.elem[parent];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }
    }

    //堆的插入
    private boolean isFull() {
        if (this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    public void push(int val) {
        //判断堆是否满->扩容
        if (isFull()) {
            this.elem = Arrays.copyOf(elem, this.elem.length * 2);
        }
        //将值放到数组最后一个位置，进行调整
        elem[this.usedSize] = val;
        this.usedSize++;
        //进行调整
        adjustUp(this.usedSize);
    }

    //堆的删除  堆顶元素
    public boolean isEmpty() {
        return this.usedSize == 0;
    }

    public void pop() {
        //是否是空堆
        if (isEmpty()) {
            return;
        }
        //最后一个元素和堆顶元素位置交换
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedSize - 1];
        this.elem[this.usedSize - 1] = tmp;
        this.usedSize--;
        //调整0号下标
        adjustDown(0, this.usedSize);
    }


    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return this.elem[0];
    }


    //大根堆从小到大排序
    //时间复杂度  O（N*log(N)）+O(N)
    // O（N*log(N)）
    public void heapSort() {
        int end = this.usedSize - 1;//最后一个
        while (end > 0) {
            //0号位值与end交换
            int tmp = this.elem[0];
            this.elem[0] = this.elem[end];
            this.elem[end] = tmp;
            //调整
            adjustDown(0, end);
            end--;
        }
    }

    //TOPK问题
    //前K个最小的元素     建立一个大小为K的大根堆

}
