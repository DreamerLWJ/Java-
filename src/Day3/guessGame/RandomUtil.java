package Day3.guessGame;


import java.util.Random;

/**
 * �����ࣺͨ�������಻��Ҫ����ʵ������Ϊ������ֻ��Ҫ��ʹ��
 * ʹ�þ�̬�ķ���ʹ�ù������������ʹ��
 */
public class RandomUtil {
    /**
     * ���������������������ɶ���
     * final��������
     */
    private static final Random random = new Random();

    /**
     * ��ǰ���ɵ�Ŀ�������
     */
    private static int target;

    /**
     * target�Ƿ��Ѿ�׼����
     */
    private static boolean isReady = false;


    private RandomUtil() {
        // ˽�й��췽����ʹ���޷�����ʵ��
    }

    /**
     * ���������������ظ�ʹ�ý������������
     */
    public static void generate() {
        // ʹ�� random ����ĳ�Ա���������������
        target = random.nextInt(100) + 1;
        isReady = true;
    }

    /**
     * �Ƚ�������С�������ز�ֵ
     * @param input ����
     * @return �������ֵ����0�����ʾ������Ҫ�������룬���С��0�����ʾС�ڣ����� 0 ��ʾ����
     */
    public static int compare(int input) {
        if (!isReady) {
            throw new IllegalStateException("����generate()����ִ��ǰ��Ҫ��������������");
        }
        return target - input;
    }
}
