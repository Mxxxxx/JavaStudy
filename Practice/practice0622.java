package JavaStudy.Practice;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-22 07:30
 **/
public class practice0622 {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] a = new boolean[p.length];
        for (int i = 0; i < p.length; i++) {
            if (s.contains(p[i])) {
                a[i] = true;
            } else {
                a[i] = false;
            }
        }
        return a;
    }

}
