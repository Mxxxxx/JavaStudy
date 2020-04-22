package Practice;

/**
 * @program: Java
 * @description: 单链表练习
 * @author: Mx
 * @create: 2020-04-21 21:04
 **/
class Node { //节点
    public int data; //data数值域
    public Node next;//next 下一个节点的引用

    public Node(int data) { //构造方法
        //对象实例化
        this.data = data;
        this.next = null;
    }
}

public class MyLinkList0421 {
    public Node head;//保存单链表的头节点的引用

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);//新建一个节点
        if (this.head == null) {
            //第一个节点插入
            this.head = node;//直接将head指向node
            return;//第一次的返回，之后head不为空，不执行判断，接着头插
        }
        node.next = this.head;
        this.head = node;//变换之后，head变成新插入的节点引用
    }

    //尾插法
    public void addLast(int data) {
        Node cur = this.head;
        Node node = new Node(data);
        if (this.head == null) {//第一次插入
            this.head = node;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;//判断尾节点
        }
        cur.next = node;
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {//判断最后一个节点域
            System.out.print(cur.data + " ");//打印数值
            cur = cur.next;
        }
    }

    //找到index前一个节点地址
    private Node indexFind(int index) {
        //找到插入位置前一个节点
        Node cur = this.head;
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("位置错误");
        }
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        return cur;
    }

    //任意位置插入，第一个数据节点下标为0  index插入下标,data插入数据
    //找到插入位置的前一个
    public void addIndex(int index, int data) {
        Node node = new Node(data); //要插入的节点
        //判断下标是否正确
        if (index == 0) {
            this.addFirst(data);
        }
        if (index == this.size()) {
            this.addLast(data);
        }
        //先找到插入位置的前一个节点 index-1
        Node cur = this.indexFind(index);
        node.next = cur.next;
        cur.next = node;

    }

    //查找是否包含某个关键字key
    public boolean keyFind(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表长度
    public int size() {
        Node a = this.head;
        int count = 0;
        while (a != null) {
            count++;
            a = a.next;
        }
        return count;
    }
}
