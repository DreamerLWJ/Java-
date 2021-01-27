package Day1;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class BubbleSortDemo {
    public static void main(String[] args) {
        // 局部变量保存数组长度
        int n;
        // 创建监听器
        Scanner sc = new Scanner(System.in);
        // 输入数组长度
        n = sc.nextInt();
        // 生成数组
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            // 出队直到找到下一个整数
            arr[i] = sc.nextInt();
        }

        // 冒泡排序
        for (int i = 0; i < n; i++) {
            // 注意条件
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 遍历输出
        System.out.println(Arrays.toString(arr));
    }
}
