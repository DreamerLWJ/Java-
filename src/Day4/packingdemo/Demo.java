package Day4.packingdemo;


public class Demo {
    public static void main(String[] args) {
        // �ϰ汾 jdk ʹ�ð�װ��Ƚ��鷳
        Integer i = new Integer(1);
        Double d = new Double(2.0);
        Character c = new Character('H');

        // �Զ���װ
        Integer iNew = 1;
        Double dNew = 2.0;
        Character cNew = 'H';

        // �Զ����
        test1(iNew);
        test2(dNew);
        test3(cNew);
    }

    static void test1(int i) {
        System.out.println(i);
    }

    static void test2(double d) {
        System.out.println(d);
    }

    static void test3(char c) {
        System.out.println(c);
    }
}
