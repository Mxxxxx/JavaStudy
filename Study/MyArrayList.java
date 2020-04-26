package JavaStudy.Study;

import java.util.Arrays;

/**
 * @program: Java
 * @description: 顺序表
 * @author: Mx
 * @create: 2020-04-19 15:33
 **/
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int intCapity = 10;

    private boolean isFull() {
//        if (this.usedSize == this.elem.length) {
//            return true;
//        }
//        return false;

        return this.usedSize == this.elem.length;
    }

    public MyArrayList() {
        this.elem = new int[intCapity];
        this.usedSize = 0;
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println();
      //  System.out.println(Arrays.toString(elem));
    }

    //在pos位置插入元素
    public void add(int pos, int data) {
        if (isFull()) {
            //扩容
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        if (pos >= 0 && pos <= usedSize) {
            for (int i = usedSize - 1; i >= pos; i--) {
                this.elem[i + 1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.usedSize++;
        }
    }

    //判断是否包含某元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize - 1; i++) {
            if (toFind == this.elem[i]) {
                return true;
            }
        }
        return false;
    }

    //查找某元素位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize - 1; i++) {
            if (toFind == this.elem[i]) {
                return i;
            }
        }
        return -1;
    }

    private void checkPos(int pos) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("位置不合法");
        }
    }

    public boolean empty(int pos) {
        if (pos <= this.usedSize) {
            return false;
        }
        return true;
    }

    //获取pos位置的元素
    public int getPos(int pos) {
        if (this.empty(pos)) {
            throw new RuntimeException("为空");
        }
        this.checkPos(pos);
        return this.elem[pos];
    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //删除第一次出现的数字
    public void remove(int toRemove) {
        int index = this.search(toRemove);
        if (index == -1) {
            System.out.println("没有需要删除的数字");
            return;
        }
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    //清除
    public void clear() {
        this.elem = new int[intCapity];
        this.usedSize = 0;
    }

    //更新pos位置的元素
    public void setPos(int pos, int val) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("pos位置不合法");
        }
        this.elem[pos] = val;
    }
}