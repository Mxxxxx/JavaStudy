import java.util.Scanner;

public class test {
    public static void print(int num) {
        if (num > 9) {
            print(num / 10);
        }
        System.out.println(num % 10);
    }

    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(num);
    }

    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);

    }

    public static void main10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }


    public static int fac2(int num) {
        if (num < 10) {
            return num;
        }
        return num % 10 + fac2(num / 10);
    }

    public static void main11(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fac2(num));
    }

    public static int fac3(int num) {
        if ((n == 1) || (n == 2)) {
            return num;
        }
        return fac3(n - 1) + fac3(n - 2);
    }

    public static void main12(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    }

    public static int fac4(int num) {
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 0; i < num; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
    }

    public static void main(String[] args) {

    }
}
