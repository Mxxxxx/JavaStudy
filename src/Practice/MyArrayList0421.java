package Practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * program: Java
 * description:顺序表练习
 * author: Mx
 * create: 2020-04-21 09:28
 **/
public class MyArrayList0421 {
    public int[] elem;
    public int usedSize;
    public static final int capacity = 10;

    public MyArrayList0421() { //构造方法
        this.elem = new int[capacity];
        this.usedSize = 0;
    }

    //判是否满顺序表
    private boolean isFull() {
//        if (this.usedSize == this.elem.length) {
//            return true;
//        }
//        return false;
        return this.usedSize == this.elem.length;
    }

    //在pos位置新增元素
    public void add(int pos, int data) {
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("新增位置错误");
        }
        for (int i = usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
    }

    //判断是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }

    private void isPos(int pos) {
        if (pos < 0 || pos > usedSize) {
            throw new RuntimeException("pos位置错误");
        }
    }

    //获取pos位置的元素
    public int getPos(int pos) {
        this.isPos(pos);
        return this.elem[pos];
    }

    //给pos位置的元素，重新设置为value
    public void setPos(int pos, int value) {
        this.isPos(pos);
        this.elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int key) {
        int index = this.search(key);
        if (index == -1) {
            System.out.println("没有需要删除的数字");
            return;
        }
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //清空顺序表
    public void clear() {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }
}
