package JavaStudy.Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-13 08:44
 **/
public class practice0613 {
    public static void func(String num) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            int n = num.charAt(i) - 48;
            if (!hashMap.containsKey(n)) {
                hashMap.put(n, 1);
            } else {
                hashMap.put(n, hashMap.get(n) + 1);
            }
        }
        for (
                HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        func(num);
    }

    public static int[] exchangeAB(int[] AB) {
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[0] ^ AB[1];
        return AB;
    }
}

