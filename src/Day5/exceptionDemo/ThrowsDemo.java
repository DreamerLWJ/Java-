package Day5.exceptionDemo;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            test();
        } catch (ArithmeticException e) {
            System.err.println("test()方法出现算术逻辑异常！");
        }
    }

    static void test() throws ArithmeticException {
        // 当前方法可能发生问题，但该方法可能因为某种原因而不能进行错误处理
        int i = 1 / 0;
    }
}
