package Day5.exceptionDemo;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            test();
        } catch (ArithmeticException e) {
            System.err.println("test()�������������߼��쳣��");
        }
    }

    static void test() throws ArithmeticException {
        // ��ǰ�������ܷ������⣬���÷���������Ϊĳ��ԭ������ܽ��д�����
        int i = 1 / 0;
    }
}
