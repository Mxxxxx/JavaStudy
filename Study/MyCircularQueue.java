package JavaStudy.Study;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-13 20:16
 **/
public class MyCircularQueue {
    public int[] elem;
    public int front;//头
    public int rear;// 当前可以存放数据元素的下标      front==rear队列是空
    //浪费一个空间存放rear

    public MyCircularQueue(int k) {
        //浪费了一个空间，想放三个
        // int[k]放的是k-1个元素，因为rear浪费了一个
        this.elem = new int[k + 1];//k为几，就存放几个
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     * 插入队列
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        this.elem[this.rear] = value;//添加队列元素
        this.rear = (this.rear + 1) % this.elem.length;//指向下一个空位置
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     * 出队列头，并删除
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        this.front = (this.front + 1) % this.elem.length;//取模
        return true;
    }

    /**
     * Get the front item from the queue.
     * 拿队列头
     */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }

    /**
     * Get the last item from the queue.
     * 拿最后一个队列元素
     */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        int index = this.rear == 0 ? this.elem.length - 1 : this.rear - 1;
        return this.elem[index];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return this.rear == this.front;
    }

    /**
     * Checks whether the circular queue is full or not.
     * 判满
     */
    public boolean isFull() {
        if ((this.rear + 1) % this.elem.length == this.front) {
            return true;
        }
        return false;
    }
}
