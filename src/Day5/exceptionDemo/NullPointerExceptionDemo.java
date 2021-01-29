package Day5.exceptionDemo;


public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            // 可能出现异常的代码块
            Object o = null;
            o.getClass();

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("发生了空指针！");
        } finally {
            System.out.println("无论异常是否发生，finally都将被执行");
        }

        System.out.println("程序是否继续执行？");
    }
}
