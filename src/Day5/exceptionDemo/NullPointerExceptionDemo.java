package Day5.exceptionDemo;


public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            // ���ܳ����쳣�Ĵ����
            Object o = null;
            o.getClass();

        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("�����˿�ָ�룡");
        } finally {
            System.out.println("�����쳣�Ƿ�����finally������ִ��");
        }

        System.out.println("�����Ƿ����ִ�У�");
    }
}
