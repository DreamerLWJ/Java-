package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.print("input:");
        // 使用 readLine() 函数（方法）来实现行读取
        str = br.readLine();
        System.out.println("output:" + str);
    }
}
