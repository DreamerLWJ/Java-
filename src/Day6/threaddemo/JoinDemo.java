package Day6.threaddemo;

public class JoinDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("����" + Thread.currentThread().getName() + i);
            if (i == 10) {
                MyThread myThread = new MyThread();
                myThread.setName("�� join() ���߳�");
                // �߳̿�ʼִ��
                myThread.start();
                try {
                    // ���̱߳���Ҫ�ȴ��� join() �߳�ִ����ϲż�����һ��
                    myThread.join();
                } catch (InterruptedException e) {
                    System.err.println("�жϷ�������join()ʧ�ܣ�");
                    e.printStackTrace();
                }
            }
        }
    }
}
