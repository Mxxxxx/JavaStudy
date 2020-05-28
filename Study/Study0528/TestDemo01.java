package JavaStudy.Study.Study0528;

import java.util.*;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-28 18:51
 **/
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class TestDemo01 {
    //给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
    //
    //要求返回这个链表的 深拷贝。 
    //
    //我们用一个由 n 个节点组成的链表来表示输入/输出中的链表。每个节点用一个 [val, random_index] 表示：
    //
    //val：一个表示 Node.val 的整数。
    //random_index：随机指针指向的节点索引（范围从 0 到 n-1）；如果不指向任何节点，则为  null 。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/copy-list-with-random-pointer
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        //1.遍历原来的单链表,老节点为k，新节点为v
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();
        while (cur != null) {
            Node node = new Node(cur.val);//老节点的val
            map.put(cur, node);//老节点为k，新节点为v
            cur = cur.next;
        }
        //说明新的和老的节点的映射关系处理完成。
        cur = head;//老节点头
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);//通过映射，从老节点里拿出新节点链接
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

    // 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
    //
    //J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/jewels-and-stones
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int numJewelsInStones(String J, String S) {
//        if (S.isEmpty()) {
//            return 0;
//        }
//        int num = 0;
//        for (int i = 0; i < S.length(); i++) {
//            for (int i1 = 0; i1 < J.length(); i1++) {
//                if (S.charAt(i) == J.charAt(i1)) {
//                    num++;
//                }
//            }
//        }
//        return num;
        int num = 0;
        if (S.isEmpty()) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                num++;
            }
        }
        return num;
    }

    //旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
    //肯定坏掉的那些键。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expected = scanner.nextLine();
        String actual = scanner.nextLine();
        Set<Character> setActual = new HashSet<>();
        for (char s : actual.toUpperCase().toCharArray()) {
            setActual.add(s);
        }
        Set<Character> setBroke = new HashSet<>();
        for (char s : expected.toUpperCase().toCharArray()) {
            if (!setActual.contains(s) && !setBroke.contains(s)) {
                System.out.println(s);
                setBroke.add(s);
            }
        }
    }

}
