package Day5.exceptionDemo;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            input();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("input�׳����쳣��");
        }
    }

    static void input() throws IllegalStateException{
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i != 1) {
            throw new IllegalStateException("���벻����Ҫ��");
        }
    }
}
