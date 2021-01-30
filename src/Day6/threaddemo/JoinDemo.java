package Day6.threaddemo;

public class JoinDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("我是" + Thread.currentThread().getName() + i);
            if (i == 10) {
                MyThread myThread = new MyThread();
                myThread.setName("被 join() 的线程");
                // 线程开始执行
                myThread.start();
                try {
                    // 主线程必须要等待被 join() 线程执行完毕才继续下一步
                    myThread.join();
                } catch (InterruptedException e) {
                    System.err.println("中断发生错误！join()失败！");
                    e.printStackTrace();
                }
            }
        }
    }
}
