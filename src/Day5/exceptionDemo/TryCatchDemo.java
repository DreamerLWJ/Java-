package Day5.exceptionDemo;


public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int i = 1 / 0;
            System.out.println("ִ�����");
        } catch (ArithmeticException e) {
            System.err.println("�����������߼��쳣");
        } finally {
            // ���� try�д�����Ƿ����쳣��finally������ִ��
            System.out.println("�����Ƿ����쳣��finally������ִ�У�");
        }
    }
}
