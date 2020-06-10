package JavaStudy.Practice;

import java.util.*;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-09 09:33
 **/
public class practice0609 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        if (num > 1000) {
//            num = 999;
//        }
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 0; i < num; i++) {
//            queue.add(i);
//        }
//        while (queue.size() > 1) {
//            int count = 0;
//            while (count != 2) {
//                queue.add(queue.peek());
//                queue.poll();
//                count++;
//            }
//            queue.remove(count);
//        }
//        queue.element();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            int i = 0;
            for (i = 0; i < n; i++) {
                list.add(i);
            }
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String temp = sc.nextLine();
            String[] arr = temp.split(" ");
            int[] result = new int[arr.length - 1];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length - 1)
                    result[i] = Integer.parseInt(arr[i]);
                else
                    k = Integer.parseInt(arr[i]);
            }
            Arrays.sort(result);
            for (int i = 0; i < k; i++) {
                if (i < k - 1)
                    System.out.print(result[i] + " ");
                else
                    System.out.println(result[i]);
            }
        }
    }
}
