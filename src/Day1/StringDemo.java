package Day1;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "你好";
        // +和+=可以用于拼接多个字符串System.out.println(s3);
        String s3 = s1 + s2;
        s3 += "！";
        // 输出字符串
        System.out.println(s3 + "[长度为：" + s3.length() + "]");
    }
}
