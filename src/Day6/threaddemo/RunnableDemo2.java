package Day6.threaddemo;

public class RunnableDemo2 {
    public static void main(String[] args) {

        // ���߳��д��������߳�
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    // ͨ�� currentThread() �������Եõ���ǰ�߳�
                    System.out.println("����" + Thread.currentThread().getName() + " " + i);
                }
            }
        }, "���߳�Ѽ");

        thread1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("����" + Thread.currentThread().getName() + " " + i);
        }
    }
}
