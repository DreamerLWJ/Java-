package Day4.systemdemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 5, 7, 4, 1, 2, 3, 8, 6};

        // 数组排序，分析源码得到是快速排序实现的
        Arrays.sort(arr);
        System.out.println("排序后的数组为：" + Arrays.toString(arr));

        // 二叉查找
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("5在已排序数组中的索引为：" + index);
    }
}
