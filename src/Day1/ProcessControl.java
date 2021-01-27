package Day1;

import java.util.Scanner;
import java.util.Vector;


public class ProcessControl {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" %d*%d=%2d", i, j, i * j);
                if (j == 5) {
                    break;
                }
            }
            System.out.println();
        }

        // 跳出多重循环的方法
        label:
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf(" %d*%d=%2d", i, j, i * j);
                if (j == 5) {
                    // 当符合条件时就跳出二重循环
                    break label;
                }
            }
            System.out.println();
        }
    }
}
