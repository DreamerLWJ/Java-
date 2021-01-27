package Day1;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // Java 允许声明数组类型变量时不初始化长度
        int[] arr1;
        arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = {1, 2, 3, 4, 5};


        // 数组元素赋值
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * i;
        }

        String s1;
        String s2 = "Hello World";


        // 数组的遍历方法
        // 方法 1，与 C 语言一样
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");

        // 方法 2，foreach语句
        for (int temp : arr1) {
            System.out.print(temp + " ");
        }
        System.out.println("\n");

        // 方法 3，Arrays工具类
        System.out.println(Arrays.toString(arr1));
    }
}
