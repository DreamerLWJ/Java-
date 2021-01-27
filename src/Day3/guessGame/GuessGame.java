package Day3.guessGame;


import java.util.Scanner;

public class GuessGame {
    /**
     * ����¶ԵĴ���
     */
    private int wins = 0;

    /**
     * �ܹ�����Ĵ���
     */
    private int playTimes = 0;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        System.out.println("��ӭ����������Ϸ��");

        while (true) {
            System.out.println("��ѡ��˵���\n" +
                    "1. ��ʼ����\n" +
                    "2. ������ʷ��Ϣ\n" +
                    "3. �˳�"
            );

            // ��������
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    if (play()) {
                        // ���ʤ���Ļ��ͼ�¼һ��ʤ��
                        wins++;
                    }
                    playTimes++;
                    break;
                case 2:
                    getInfo();
                    break;
                case 3:
                    quit();
                    break;
            }
        }
    }

    /**
     * ���Ⱪ¶�Ŀ�ʼ��Ϸ����
     * @return ��ʾ�Ƿ�ʤ�����
     */
    private boolean play() {
        Scanner scanner = new Scanner(System.in);
        int i;
        // ������ʹ���������
        RandomUtil.generate();

        System.out.print("�����������-1�˳�����");
        i = scanner.nextInt();
        if (i == -1) {
            return false;
        }

        if (guess(i)) {
            System.out.println("��������");
        }

        while (true) {
            System.out.print("��������루-1�˳�����");
            i = scanner.nextInt();
            if (i == -1) {
                return false;
            }

            if (guess(i)) {
                System.out.println("��������");
                return true;
            }
        }
    }

    /**
     * ��������㷽��
     * @param input ����
     * @return ��ʾ�Ƿ����
     */
    private boolean guess(int input) {
        int temp = RandomUtil.compare(input);

        if (temp == 0) {
            // �ɹ�������
            return true;
        }

        if (temp > 0) {
            System.out.println("��С�ˣ�");
        } else {
            System.out.println("�´��ˣ�");
        }
        return false;
    }

    /**
     * ������˵���ʷʤ������
     */
    public void getInfo() {
        System.out.println("���ܹ�����Ĵ����ǣ�" + playTimes);
        System.out.println("��ʤ���Ĵ����ǣ�" + wins);
        System.out.println("����ʤ��Ϊ��" + (double)wins/playTimes);
    }

    public void quit() {
        // �����˳�
        System.exit(0);
    }
}
