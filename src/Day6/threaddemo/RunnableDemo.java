package Day6.threaddemo;

// ʵ�� Runnable �ӿڶ����߳�
class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i == 10) {
                // �߳����ߣ���ǰ�߳���ִͣ��һ��ʱ��
//                    Thread.sleep(5000);

                // �߳��ж�
//                return;
            }
            System.out.println("����" + Thread.currentThread().getName() + " " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();

        Thread thread1 = new Thread(myThread2, "�߳�1");
        Thread thread2 = new Thread(myThread2, "�߳�2");
        thread1.start();
        thread2.start();
    }
}
