package JavaStudy.Study;

/**
 * program: Java
 * description:
 * author: Mx
 * create: 2020-04-20 18:56
 **/
//节点
class Node {
    public int data;//0
    public Node next;//null

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    public Node head;//保存单链表的头节点的引用

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {  //第一次插入
            this.head = node;
            return;
        }
        node.next = this.head;  //要先绑后面
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    //查找是否包含关键字key
    public boolean contains(int data) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == data) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表长度
    public int size() {
        Node cur = this.head;
        if (cur == null) {
            return 0;
        }
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
}
