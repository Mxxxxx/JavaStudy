package JavaStudy.Practice;


//public class practice0409 {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int tmp = 0;
//        tmp = a;
//        a = b;
//        b = tmp;
//        System.out.printf("a=%d\n", a);
//        System.out.printf("b=%d\n", b);
//    }
//}

public class practice0409 {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        int c=20;
        if (a > b) {
            if (a > c){
                System.out.printf("最大值：%d",a);
            }
            if (b > c) {
                System.out.printf("最小值：%d",c);
            }
            else {
                System.out.printf("最小值：%d",b);
            }
        }
        else {
            if (b > c){
                System.out.printf("最大值：%d",b);
            }
            if (a > c) {
                System.out.printf("最小值：%d",c);
            }
            else {
                System.out.printf("最小值：%d",a);
            }
        }
    }
}


