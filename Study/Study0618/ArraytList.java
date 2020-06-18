package JavaStudy.Study.Study0618;

import java.util.Arrays;

/**
 * @program: Java
 * @description:
 * @author: Mx
 * @create: 2020-06-18 19:13
 **/
public class ArraytList {
    private int size;
    private int[] array = new int[16];

    public void add(int element) {
        if (this.size + 1 == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[this.size++] = element;
    }
}
