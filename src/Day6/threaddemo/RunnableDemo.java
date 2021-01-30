package Day6.threaddemo;

// 实现 Runnable 接口定义线程
class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                // 线程休眠：当前线程暂停执行一段时间
//                    Thread.sleep(5000);

                // 线程中断
//                return;
            }
            System.out.println("我是" + Thread.currentThread().getName() + " " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();

        Thread thread1 = new Thread(myThread2, "线程1");
        Thread thread2 = new Thread(myThread2, "线程2");
        thread1.start();
        thread2.start();
    }
}
