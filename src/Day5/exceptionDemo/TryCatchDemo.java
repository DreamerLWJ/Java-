package Day5.exceptionDemo;


public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int i = 1 / 0;
            System.out.println("执行完毕");
        } catch (ArithmeticException e) {
            System.err.println("发生了算术逻辑异常");
        } finally {
            // 无论 try中代码块是否发生异常，finally都将被执行
            System.out.println("无论是否发生异常，finally都必须执行！");
        }
    }
}
