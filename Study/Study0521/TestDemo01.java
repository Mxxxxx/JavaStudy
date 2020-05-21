package JavaStudy.Study.Study0521;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-05-21 18:50
 **/
public class TestDemo01 {
    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = {27, 15, 19, 18, 28, 34, 64, 49, 25, 37};
        testHeap.creatHeap(array);
        //testHeap.push(80);
        testHeap.show();
    }
}
