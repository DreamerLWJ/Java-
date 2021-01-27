package Day1;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class BubbleSortDemo {
    public static void main(String[] args) {
        // �ֲ������������鳤��
        int n;
        // ����������
        Scanner sc = new Scanner(System.in);
        // �������鳤��
        n = sc.nextInt();
        // ��������
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            // ����ֱ���ҵ���һ������
            arr[i] = sc.nextInt();
        }

        // ð������
        for (int i = 0; i < n; i++) {
            // ע������
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // �������
        System.out.println(Arrays.toString(arr));
    }
}
