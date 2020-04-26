package JavaStudy.Study;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-04-26 18:37
 **/
class Node1 {
    public int data;
    public Node1 next; // 后继信息
    public Node1 prev; //前驱信息
    
    public Node1(int data) {
        this.data = data;
    }
}

public class MyDoubleLinkedList {
    public Node1 head;//标志双向链表的头
    public Node1 tail;//标志双向链表的尾巴

    //头插法
    public void addFirst(int data) {
        Node1 node = new Node1(data);
        //第一个节点
        if (this.head == null) {
            this.head = node;
            this.tail = node;//也是将来的尾节点
        } else {//不是第一次
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        Node1 node1 = new Node1(data);
        if (this.head == null) {
            this.head = node1;
            this.tail = node1;
        } else {
            this.tail.next = node1;
            node1.prev = this.tail;
            this.tail = node1;
        }
    }

    //查找关键字
    public boolean contains(int key) {
        Node1 node1 = new Node1(key);
        Node1 cur = this.head;
        while (cur != null) {
            if (node1.data == cur.data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //求长度
    public int size() {
        Node1 cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //任意位置插入下标值
    private void checkIndex(int key) {
        //判断下标合法
        if (key < 0 || key > size()) {
            throw new RuntimeException("不合法");
        }
    }

    private Node1 searchIndex(int key) {
        //查找下标位置
        Node1 cur = this.head;//找到插入位置的下一个节点
        while (key > 0) {
            cur = cur.next;
            key--;
        }
        return cur;
    }

    public void index(int key, int data) {
        checkIndex(key);
        Node1 node1 = new Node1(data);
        Node1 cur = searchIndex(key);
        if (key == 0) {//判断头插
            addFirst(data);
            return;
        }
        if (key == size()) {//判断插入最后
            addLast(data);
            return;
        }
        node1.next = cur;
        node1.prev = cur.prev;
        cur.prev.next = node1;
        cur.prev = node1;
    }

    //删除关键字key的节点
    public int remove(int key) {
        //找到返回要删除的，找不到返回-1
        Node1 cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                int oldData = cur.data;
                if (cur == this.head) {  //删除头
                    this.head = this.head.next;
                    this.head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        //删除尾，直接移动tail
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }

    //删除所有
    public void removeAll(int key) {
        Node1 cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                int oldData = cur.data;
                if (cur == this.head) {  //删除头
                    this.head = this.head.next;
                    if (this.head != null) {
                        this.head.prev = null;
                    }
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        //删除尾，直接移动tail
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    //清除
    //一个个释放
    public void clear() {
        while (this.head != null) {
            Node1 cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.tail = null;
    }

    //打印
    public void display() {
        Node1 cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }
}
