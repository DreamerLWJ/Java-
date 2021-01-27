package Day1;

import java.io.IOException;

public class InputDemo1 {
    public static void main(String[] args) throws IOException {
        System.out.print("输入字符:");
        // 这里可能会抛出异常
        char i = (char) System.in.read();
        System.out.println("你输入的字符是:" + i);
    }
}
