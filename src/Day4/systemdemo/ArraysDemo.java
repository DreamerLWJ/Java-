package Day4.systemdemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 5, 7, 4, 1, 2, 3, 8, 6};

        // �������򣬷���Դ��õ��ǿ�������ʵ�ֵ�
        Arrays.sort(arr);
        System.out.println("����������Ϊ��" + Arrays.toString(arr));

        // �������
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("5�������������е�����Ϊ��" + index);
    }
}
