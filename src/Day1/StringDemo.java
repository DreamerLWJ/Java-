package Day1;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "���";
        // +��+=��������ƴ�Ӷ���ַ���System.out.println(s3);
        String s3 = s1 + s2;
        s3 += "��";
        // ����ַ���
        System.out.println(s3 + "[����Ϊ��" + s3.length() + "]");
    }
}
