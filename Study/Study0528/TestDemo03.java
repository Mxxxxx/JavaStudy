package JavaStudy.Study.Study0528;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-28 20:23
 **/
public class TestDemo03 {
    public static void main(String[] args) {
        TestDemo02 testDemo02 = new TestDemo02();
        int[] array = {7, 2, 9, 18, 56, 15, 3};
        for (int i : array) {
            testDemo02.insert(i);
        }
        testDemo02.preOrder(testDemo02.root);
        System.out.println();
        System.out.println(testDemo02.search(18).val);
        System.out.println();

    }
}
