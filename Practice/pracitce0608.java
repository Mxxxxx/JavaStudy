package JavaStudy.Practice;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-08 08:33
 **/
public class pracitce0608 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//长度(列数)
        int n = sc.nextInt();//宽度(行数)
        int first = (m/4)*2+(m%4<=2?m%4:2);

        int second = (m/4)*2+(m%4>2?(m%4)-2:0);
        int sum = (n/4)*(first+second)*2;
        //如果还有余行（行数小于4）
        if(n%4>0){
            sum+=first; //余下一行的情况
        }
        if(m%4>1){
            sum+=first;//余下两行的情况，和上边一个进行累加
        }
        if(m%4>2){
            sum+=second;//余下三行的情况，和上边两个进行累加
        }
        System.out.println(sum);

    }

    public static int funnc1(int A, int B) {
        if (A == 0) {
            return B;
        }
        while (A % B != 0) {
            int tmp = A % B;
            A = B;
            B = tmp;
        }
        return B;
    }

    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int A = in.nextInt();
            int B = in.nextInt();
            System.out.println(A * B / funnc1(A, B));
        }
    }

}
