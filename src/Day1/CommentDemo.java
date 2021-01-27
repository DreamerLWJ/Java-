package Day1;


import java.util.Scanner;

public class CommentDemo {
    // 单行注释

    /*
        这是
        多行
        注释
     */

    /**
     * 这是实现加法的函数
     * @param a 被加数
     * @param b 加数
     * @return a与b的和
     */
    public int add(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        return a + b;
    }
}
