package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        System.out.print("input:");
        // ʹ�� readLine() ��������������ʵ���ж�ȡ
        str = br.readLine();
        System.out.println("output:" + str);
    }
}
