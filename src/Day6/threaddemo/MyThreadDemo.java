package Day6.threaddemo;

// (1) 定义 Thread 类的子类
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            // 通过 currentThread() 方法可以得到当前线程
            System.out.println("我是" + Thread.currentThread().getName() + " " + i);
        }

        // 定义别的任务
    }
}

public class MyThreadDemo {
    public static void main(String[] args) {
        // 创建实例
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        // Thread 提供了非常多有用的方法，比如设置线程名字
//        thread1.setName("线程1");
//        thread2.setName("线程2");
//        thread3.setName("线程3");
        // TODO 注意不是 run(), 是 start()
        // 异步概念：指多个任务并行处理，多个任务之间就是异步的
        // 买东西，商店老板告诉我货物不在台前，需要去仓库那给我，我就在台前等他给我，这就是同步的
        // 网购买东西，我只需要下单，而货物送过来这个任务和我其他任务是并行的，这就是异步的
        thread1.start();
        thread2.start();
        thread3.start();
        // TODO 演示主线程等待子线程完成才结束
//        for (int i = 0; i < 20; i++) {
//            System.out.println("我是" + Thread.currentThread().getName() + " " + i);
//        }
    }
}
