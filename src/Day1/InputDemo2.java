package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo2 {
    public static void main(String[] args) throws IOException {
        System.out.print("输入字符:");
        InputStreamReader inputStreamReader  = new InputStreamReader(System.in);
        // 从键盘读取
        char i = (char) inputStreamReader.read();
        System.out.println("你输入的字符是：" + i);
    }
}
