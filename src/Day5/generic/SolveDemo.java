package Day5.generic;

import java.util.ArrayList;

public class SolveDemo {
    public static void main(String[] args) {
        // 集合容器，类似于数组用来保存其他类型变量
        ArrayList<String> arrayList = new ArrayList<>();
        String s1 = "Hello";
        String s2 = "Java";
        String s3 = "Hello";
        String s4 = "World";

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        // 解决：无需强制类型转换
        String s = arrayList.get(1);
        System.out.println(s);
    }
}
