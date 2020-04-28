package JavaStudy.Practice;

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
        if (this.head == null) {
            System.out.println("单链表为空");
        }
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

    private Node searchPrev(int key) {
        Node prev = this.head;

        while (prev.next != null) {
            if (prev.next.data == key) {//查找删除关键字的前驱
                return prev;
            } else {
                prev = prev.next;
            }
        }
        return null;
    }

    //删除第一次出现关键字key的节点
    public void findKey(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.data == key) {//判断是否删除的是第一个
            this.head = this.head.next;//如果是，则将头转移到第二个节点
            return;
        }
        Node prev = searchPrev(key);
        if (prev == null) {
            System.out.println("无节点");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;
    }

    //删除所有值为key的节点
    public void deleteKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        if (this.head == null) {
            System.out.println("单链表为空");
        }
        while (cur != null) {//从第二个开始判断
            if (cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur; //prev跳转
                cur = cur.next; //最后一个节点next为null，终止循环
            }
        }
        //判断第一个是不是关键字key
        if (this.head.data == key) {//删除第一个是key的 head
            this.head = this.head.next;//头节点转移
        }
    }

    //清空单链表
    //释放内存  JVM在回收内存时，当该对象没有人再引用时，就会回收
    public void clear() {
        this.head = null;
    }

    //反转单链表
    public Node reverse() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;//cur的下一个节点
            if (curNext == null) {
                newHead = cur;//新的头，即反转过去的

            }
            cur.next = prev;//反转节点
            //向后继续反转
            prev = cur;//移动prev到cur
            cur = curNext;//移动到下一个节点
        }
        return newHead;
    }

    public void display2(Node newHead) {
        Node cur = newHead;
        if (this.head == null) {
            System.out.println("单链表为空");
        }
        while (cur != null) {//判断最后一个节点域
            System.out.print(cur.data + " ");//打印数值
            cur = cur.next;
        }
    }

    //返回链表中间节点
    public int returnMid() {
        //快指针走两步  慢指针走一个，走完即是一半
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) { //用于最后fast走的两个节点，两个都不为空则没走完/
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    //输出链表中倒数的第k个节点值
    public int findReverseKey(int k) {
        Node fast = this.head;//提前走k-1
        Node slow = this.head;
//        if (k < 0 || k > size()) {
//            System.out.println("输入错误");
//        }
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("没有");
            }
        }
        //提前走的
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }

    //合并两个升序单链表,然后按升序输出
    public Node mergeTwoLists(Node node1, Node node2) {
        Node cur = new Node(-1);//虚拟节点
        Node tmp = cur;
        while (node1 != null && node2 != null) {
            if (node1.data <= node2.data) { //依次比较，谁小指向谁
                tmp.next = node1;           //循环结束绝对有一个链表已经为空，另一个则自动单独排序
                node1 = node1.next;         //两链表不一定等长，只需判断一条为空，剩下的节点则本身就是升序
            } else {
                tmp.next = node2;
                node2 = node2.next;
            }
            tmp = tmp.next;//将tmp随着链表一起移动
        }
        tmp.next = node1 == null ? node2 : node1;   //指向剩余的节点

        return cur.next;
    }

    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
//给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。
    public Node partition(int x) {
        Node cur = this.head;
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;
        while (cur != null) {
            if (cur.data < x) {
                //第一次插入
                if (bs == null) {
                    bs = cur;
                    be = cur;
                } else {
                    be.next = cur;
                    be = be.next;
                }
            } else {
                //第一次插入
                if (as == null) {
                    as = cur;
                    ae = cur;
                } else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //1.判断bs是否为空，如果bs为空，返回as
        if (bs == null) {
            return as;
        } else {        //2.如果bs不为空，需要进行拼接
            be.next = as;
            if (ae != null) {        //3.如果ae不为空，ae.next需要为null
                ae.next = null;
            }
        }
        return bs;
    }

    // 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    public Node deleteDuplication() {
        // 判断cur.data与cur.next.data
        //相同
        //不同

        Node newHead = new Node(-1);//虚拟节点
        Node tmp = newHead;
        Node cur = this.head;
        while (cur != null) {
            if (cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
            } else {
                tmp.next = cur;
                tmp = tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }

    //对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
    public boolean chkPalindrome() {
        Node fast = this.head;
        Node slow = this.head;
        Node head = this.head;
        if (this.head == null) { //链表为空情况
            return false;
        }
        if (this.head.next == null) { //只有一个节点情况
            System.out.println("只有头节点自己");
            return true;
        }
        //找中间
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转
        Node cur = slow.next;//中间的slow给cur
        while (cur != null) {
            Node curNext = cur.next;//后面逐个反转
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }//slow为最后一个节点

        //一个从头走，一个从尾走
        while (slow != head) {
            if (head.data != slow.data) {
                return false;
            }
            //判断偶数
            if (this.head.next == slow) {
                return true;
            }
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    //判断单链表中，是否有环，有的话单链表则没有null
    public Boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;
        //判断有没有环
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //给定列表，如果有环，求出环的入口点
    public Node detectCycle() {
        Node fast = this.head;
        Node slow = this.head;
        //判断有没有环
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null && fast.next == null) {
            return null;
        }
        slow = this.head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //找两个链表相遇的节点
    //1.求单链表长度
    //2.计算差值  让长的单链表先走差值步
    //3.然后同时开始走

}