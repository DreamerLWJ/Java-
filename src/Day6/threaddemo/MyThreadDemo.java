package Day6.threaddemo;

// (1) ���� Thread �������
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            // ͨ�� currentThread() �������Եõ���ǰ�߳�
            System.out.println("����" + Thread.currentThread().getName() + " " + i);
        }

        // ����������
    }
}

public class MyThreadDemo {
    public static void main(String[] args) {
        // ����ʵ��
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();

        // Thread �ṩ�˷ǳ������õķ��������������߳�����
//        thread1.setName("�߳�1");
//        thread2.setName("�߳�2");
//        thread3.setName("�߳�3");
        // TODO ע�ⲻ�� run(), �� start()
        // �첽���ָ��������д����������֮������첽��
        // �������̵��ϰ�����һ��ﲻ��̨ǰ����Ҫȥ�ֿ��Ǹ��ң��Ҿ���̨ǰ�������ң������ͬ����
        // ������������ֻ��Ҫ�µ����������͹����������������������ǲ��еģ�������첽��
        thread1.start();
        thread2.start();
        thread3.start();
        // TODO ��ʾ���̵߳ȴ����߳���ɲŽ���
//        for (int i = 0; i < 20; i++) {
//            System.out.println("����" + Thread.currentThread().getName() + " " + i);
//        }
    }
}
