package Day2.methodDemo;

public class MethodDemo {
    // ���췽��
    public MethodDemo() {
        System.out.println("this is a constructor");
    }

    // ��Ա����
    void memberMethod() {
        System.out.println("this is a member method");
        // ��һ�в�����������ʵ����Ա���Է��ʾ�̬��Ա
        staticMethod();
    }

    // ��̬����
    static void staticMethod() {
        System.out.println("this is a static method");
        // ��һ�н�����������󣡾�̬��Ա���ܷ���ʵ����Ա
//        memberMethod();
    }
}

class Demo {
    public static void main(String[] args) {

    }
}
