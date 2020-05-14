package JavaStudy.Study;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-13 19:27
 **/
class Node4 {
    //利用链表实现队列
    //先进先出
    public int data;
    public Node4 next;

    public Node4(int data) {
        this.data = data;
    }
}

public class MyQeue {
    public Node4 front;//头部节点
    public Node4 tail;//尾部节点
    public int usedSize;//队列元素个数

    //入队列
    public boolean offer(int val) {
        Node4 node = new Node4(val);
        if (this.front == null) {//判断是否是第一个进入队列的节点
            this.front = node;
            this.tail = node;
            return true;
        }
        this.tail.next = node;//当前节点指向新添加的节点
        this.tail = node;//尾部指针移动到当前节点
        this.usedSize++;
        return true;
    }

    //出队列,且删除
    public int poll() {
        if (isEmpty()) {
            throw new RuntimeException("无");
        }
        Node4 cur = this.front;//先进先出，直接出头部节点
        this.front = this.front.next;//头部节点删除，转移到下一个节点
        this.usedSize--;//数量减一
        return cur.data;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return this.front == null;
    }

    //出队列
    public int peek() {
        return this.front.data;//出队列
    }

    //计算队列长度
    public int size() {
        return this.usedSize;
    }

}
