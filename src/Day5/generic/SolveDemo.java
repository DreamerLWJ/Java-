package Day5.generic;

import java.util.ArrayList;

public class SolveDemo {
    public static void main(String[] args) {
        // �����������������������������������ͱ���
        ArrayList<String> arrayList = new ArrayList<>();
        String s1 = "Hello";
        String s2 = "Java";
        String s3 = "Hello";
        String s4 = "World";

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        // ���������ǿ������ת��
        String s = arrayList.get(1);
        System.out.println(s);
    }
}
