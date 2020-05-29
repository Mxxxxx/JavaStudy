package JavaStudy.Study.Study0529;

/**
 * @program: Java
 * @description: 哈希表
 * 增删查改的复杂度都是O（1）
 * <p>
 * 核心：
 * 1.内部是一个数组  大小远远小于插入数量
 * 2.关键字经过变化hash函数得到int类型的值
 * 3.int类型的值变成一个合法的下标
 * 4.把关键字放到这个合法的下标位置
 * <p>
 * <p>
 * 负载因子越少，冲突越小
 * <p>
 * 负载因子：填入表中元素个数 / 散列表的长度
 * 避免冲突的方式：
 * 1.构建哈希表
 * 2.放入元素，判断是否超过负因子，超过了就扩容
 * <p>
 * <p>
 * 解放冲突方法：
 * 1.闭散列（开放地址法）
 * a.线性探测法： 从发生冲突的位置开始，依次向后探测下一个空的位置，放入（冲突元素聚集）
 * b.二次探测：从发生冲突位置开始，向后探测 i^2次（第几次冲突）的位置，放入（冲突元素分散）
 * 2.开散列（闭地址法、哈希桶）  数组+哈希表-》JDK1.7    数组+链表+红黑树-》JDK1.8 （链表长度》8变为红黑树）
 * a.找对应的位置，hash函数设计
 * b.放入单链表中,头插/尾插，将冲突元素链接起来
 * @author: Mx
 * @create: 2020-05-29 18:34
 **/
class HashBuck {
    static class Node {
        public int val;
        public int key;
        public Node next;

        public Node(int key, int val) {
            this.val = val;
            this.key = key;
        }
    }

    public Node[] array = new Node[10];
    public int usedSize;

    public double loadFactor() {
        return this.usedSize * 1.0 / this.array.length;
    }

    public void resize() {
        Node[] newArray = new Node[2 * this.array.length];
        for (int i = 0; i < this.array.length; i++) {
            Node cur = array[i];//拿节点数组的第一个  横向
            while (cur != null) {//纵向，链表查找
                Node curNext = cur.next;
                int newIndex = cur.key % newArray.length;//算出新的位置
                cur.next = newArray[newIndex];
                newArray[newIndex] = cur;
                cur = curNext;
            }
        }
        array = newArray;
    }

    public void put(int key, int val) {
        //1.通过设计的哈希函数，找到对应的位置
        int index = key % array.length;
        for (Node cur = array[index]; cur != null; cur = cur.next) {
            if (cur.key != key) {
                //key相同，更新val
                cur.val = val;
                return;
            }
        }
        Node node = new Node(key, val);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;

        if (loadFactor() > 0.75) {
            resize();//扩容
        }
    }

    public int get(int key) {
        int index = key % array.length;
        Node cur = array[index];
        while (cur != null) {
            if (cur.key == key) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
}

public class TestDemo01 {
    public static void main(String[] args) {
        HashBuck hashBuck = new HashBuck();
        for (int i = 0; i < 11; i++) {
            hashBuck.put(i, i);
        }

    }

}
