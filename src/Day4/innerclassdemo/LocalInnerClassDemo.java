package Day4.innerclassdemo;

public class LocalInnerClassDemo {
    void test() {
        class LocalInnerClass {
            void info() {
                System.out.println("���Ǿֲ��ڲ��࣡");
            }
        }

        // ����������������е�
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.info();
    }
}

class Demo2 {
    public static void main(String[] args) {
        // ������뽫���ִ��󣬾ֲ��ڲ���ֻ�ڶ��巽������Ч
//        LocalInnerClass innerClass = new LocalInnerClass();

        LocalInnerClassDemo demo = new LocalInnerClassDemo();
    }
}
