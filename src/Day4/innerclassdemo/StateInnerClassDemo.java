package Day4.innerclassdemo;

public class StateInnerClassDemo {
    private int prop1 = 5;
    private static int prop2 = 9;

    static class StaticInnerClass {
        // ��̬�ڲ�����԰�����̬��Ա
        private static int age;
        public void accessOuterProp() {
            // ������뽫���ִ���
            // ��̬�ڲ����޷������ⲿ���ʵ����Ա
//            System.out.println(prop1);

            // �����������
            System.out.println(prop2);
        }
    }
}
