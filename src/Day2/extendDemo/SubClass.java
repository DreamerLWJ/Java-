package Day2.extendDemo;

public class SubClass extends SuperClass{

    public SubClass() {
        System.out.println("����Ĺ��췽��ִ����...");
    }

    // ��չ����Ĺ���
    public void say2() {
        // ����ӵ�и���ĳ�Ա����
        String s = this.name;
        System.out.println("SubClass " + " My father is " + name);
    }
}

