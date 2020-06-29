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

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        String soil = in.nextLine();
        String buy = in.nextLine();
        func(soil, buy);
    }

    public static void func(int num) {
        int A1 = 0;
        int A2 = 0;
        int i = 1;
        int A3 = 0;
        double A4 = 0;
        int A5 = 0;
        int count = 0;
        int a = 0;
        if (num % 5 == 0 && num % 2 == 0) {
            A1 += num;
        } else if (num % 5 == 1) {
            A2 = num * i;
            i *= -1;
        } else if (num % 5 == 2) {
            A3++;
        } else if (num % 5 == 3) {
            a += num;
            count++;
        } else if (num % 5 == 4) {
            int tmp = num;
            A5 = A5 < tmp ? tmp : A5;
        }
        A4 = a / (count * 1.0);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int A1 = 0, A2 = 0, A3 = 0, A5, t = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        double A4 = 0;
        int sum = 0, b = 0;
        int max = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 5 == 0) {
                if (a[i] % 2 == 0) {
                    A1 = A1 + a[i];
                    c1++;
                }
            } else if (a[i] % 5 == 1) {
                c2++;

                if (count % 2 == 1)
                    a[i] = a[i];
                else
                    a[i] = (-1) * a[i];
                A2 = A2 + a[i];
                count++;
            } else if (a[i] % 5 == 2) {
                c3++;
                A3++;
            } else if (a[i] % 5 == 3) {
                c4++;
                b++;
                sum = sum + a[i];
            } else if (a[i] % 5 == 4) {
                c5++;

                if (max < a[i]) {
                    t = max;
                    max = a[i];
                    a[i] = t;
                }

            }
        }

        A5 = max;
        if (c1 == 0) {
            System.out.print("N" + " ");
        }
        if (c1 != 0) {
            System.out.print(A1 + " ");
        }
        if (c2 == 0) {
            System.out.print("N" + " ");
        }
        if (c2 != 0) {
            System.out.print(A2 + " ");
        }
        if (c3 == 0) {
            System.out.print("N" + " ");
        }
        if (c3 != 0) {
            System.out.print(A3 + " ");
        }
        if (c4 == 0) {
            System.out.print("N" + " ");
        }
        if (c4 != 0) {
            A4 = (float) sum / b;
            System.out.printf("%.1f" + " ", A4);
        }
        if (c5 == 0) {
            System.out.print("N");
        }
        if (c5 != 0) {
            System.out.print(A5);
        }
    }

}


