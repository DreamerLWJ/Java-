package Day4.packingdemo;


public class Demo {
    public static void main(String[] args) {
        // 老版本 jdk 使用包装类比较麻烦
        Integer i = new Integer(1);
        Double d = new Double(2.0);
        Character c = new Character('H');

        // 自动包装
        Integer iNew = 1;
        Double dNew = 2.0;
        Character cNew = 'H';

        // 自动拆包
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
