package Day3.finalDemo;

public class FinalDemo {
    // ��̬��Ա�������������
    private static final int num = 0;
    // �Ǿ�̬��Ա����
    private final int count;

    public FinalDemo(int count) {
        // �����ڹ��췽���ڲ�������г�ʼ��
        this.count = count;
        // ����޸�
    }

    public void update(int count) {
        // �����޸Ľ�����������
//        this.count = count;

        final int i;
        i = 1;
        // �����޸Ľ�����������
//        i = 2;
    }
}
