package Day1;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // Java ���������������ͱ���ʱ����ʼ������
        int[] arr1;
        arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = {1, 2, 3, 4, 5};


        // ����Ԫ�ظ�ֵ
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * i;
        }

        String s1;
        String s2 = "Hello World";


        // ����ı�������
        // ���� 1���� C ����һ��
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");

        // ���� 2��foreach���
        for (int temp : arr1) {
            System.out.print(temp + " ");
        }
        System.out.println("\n");

        // ���� 3��Arrays������
        System.out.println(Arrays.toString(arr1));
    }
}
