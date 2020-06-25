package JavaStudy.Practice;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-25 07:32
 **/
class ListNode2 {
    int val;
    ListNode2 next = null;

    ListNode2(int val) {
        this.val = val;
    }
}

public class practice0625 {
    public ListNode plusAB(ListNode a, ListNode b) {
        ListNode2 c = null;
        int carry = 0;
        int tmp = 0;
        while (a.next != null || b.next != null) {
            int num1 = a == null ? 0 : a.val;
            int num2 = b == null ? 0 : b.val;
            tmp = num1 + num2 + carry;
            if (tmp > 10) {
                tmp = tmp - 10;
                carry = 1;
            }
            ListNode2 listNode2 = new ListNode2(tmp);
            c.next = listNode2;
            a = a.next;
            b = b.next;
        }
        return a;
    }

    public static void func(String soil, String buy) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < soil.length(); i++) {
            int length = map.getOrDefault(soil.charAt(i), 0);
            map.put(soil.charAt(i), length + 1);
        }
        int count = 0;
        for (int j = 0; j < buy.length(); j++) {
            int len = map.getOrDefault(buy.charAt(j), 0);
            if (len <= 0) {
                count++;
            }
            map.put(buy.charAt(j), len - 1);
        }
        if (count == 0) {
            System.out.println("yes" + " " + (soil.length() - buy.length()));
        } else {
            System.out.println("no" + " " + count);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String soil = in.nextLine();
        String buy = in.nextLine();
        func(soil, buy);
    }
}

