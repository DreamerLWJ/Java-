package Day6.threaddemo;

public class RunnableDemo2 {
    public static void main(String[] args) {

        // 主线程中创建的子线程
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    // 通过 currentThread() 方法可以得到当前线程
                    System.out.println("我是" + Thread.currentThread().getName() + " " + i);
                }
            }
        }, "子线程鸭");

        thread1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我是" + Thread.currentThread().getName() + " " + i);
        }
    }
}
