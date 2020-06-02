package JavaStudy.Practice;

import java.util.*;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-01 09:08
 **/
public class practice0601 {

    //给定两个字符串 s 和 t，判断它们是否是同构的。
    //如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
    //所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/isomorphic-strings
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
//    public boolean isIsomorphic(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        HashMap<Character, Character> map = new HashMap<>();
////        for (char a : s.toCharArray()) {
////
////        }
//        for (int i = 0; i < s.length(); i++) {
//            char char1 = s.charAt(i);
//            char char2 = t.charAt(i);
//            if (map.get(char1) == null) {//判断 s 中的是由有
//                if (map.containsValue(char2)) {
//                    return false;
//                }
//                map.put(char1, char2);
//            } else if (map.get(char1) != char2) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    //给定两个数组，编写一个函数来计算它们的交集。
//    public int[] intersect(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums1.length; i++) {
//            if (map.containsKey(nums1[i])) {
//                map.put(nums1[i], map.get(nums1[i]) + 1);
//            } else {
//                map.put(nums1[i], 1);
//            }
//        }
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i = 0; i < nums2.length; i++) {
//            if (map.containsKey(nums2[i])) {
//                list.add(nums2[i]);
//                map.put(nums2[i], map.get(nums2[i]) - 1);
//            }
//        }
//        int count = list.size();
//        int[] aux = new int[count];
//        for (int i = 0; i < count; i++) {
//            aux[i] = list.poll();
//        }
//        return aux;
//    }
//
//    //给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//    public int firstUniqChar(String s) {
//        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
//        int n = s.length();
//        // build hash map : character and how often it appears
//        for (int i = 0; i < n; i++) {
//            char c = s.charAt(i);
//            count.put(c, count.getOrDefault(c, 0) + 1);
//        }
//
//        // find the index
//        for (int i = 0; i < n; i++) {
//            if (count.get(s.charAt(i)) == 1)
//                return i;
//        }
//        return -1;
//    }

    public static boolean isHuiWen(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        int conut = 0;
        for (int i = 0; i <= A.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder(A);
            stringBuilder.insert(i, B);
            if (isHuiWen(stringBuilder.toString())) {
                conut++;
            }
        }
        System.out.println(conut);
    }


    public static int findKth(int[] a, int n, int K) {
        int tmp = 0;
        for (int i = 1; i < n; i++) {//从第二个开始
            tmp = a[i];
            int j = i - 1;//前一个
            while (j >= 0) {
                if (a[j] < tmp) {//前一个大于后一个 的话  稳定  ；要是>=tmp 则不稳定
                    a[j + 1] = a[j];//将前一个的值赋值给后一个
                } else {
                    break;
                }
                j--;
            }
            a[j + 1] = tmp;//放入较大的那个值
        }
        return a[K];
    }

    public static void main2(String[] args) {
//        int[] a = {1, 3, 5, 2, 2};
//        System.out.println(findKth(a, 5, 3));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int i = 0;
        for (int i1 = 0; i1 < n; i1++) {
            a[i1] = sc.nextInt();
        }
        System.out.println(findKth(a, n, k));
    }

    public static int func(int num) {
        int sum = 0;
        while (num > 2) {
            sum += num / 3;
            num = num / 3 + num % 3;
        }
        if (num == 2) {
            sum++;
        }
        return sum;
    }

    public static int count(int[] A, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] A = {1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(count(A, n));
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(func(num));
        }
        System.exit(0);
    }

}
