package Day2.overloadDemo;


public class OverLoadDemo {
    private String name;
    private int id;

    // ���췽������
    public OverLoadDemo(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("���췽��1");
    }

    public OverLoadDemo(String name) {
        this.name = name;
        System.out.println("���췽��2");
    }

    public OverLoadDemo(int id) {
        this.id = id;
        System.out.println("���췽��3");
    }

    public OverLoadDemo(double id) {
        System.out.println("���췽��4");
    }

    // ��Ա��������
    public int f(String name, int id) {
        System.out.println("��Ա����1");
        return id;
    }

    public String f(String name) {
        System.out.println("��Ա����2");
        return name;
    }

    public int f(int name) {
        System.out.println("��Ա����3");
        return 1;
    }

    public static void main(String[] args) {
        OverLoadDemo overLoadDemo = new OverLoadDemo("jiang", 1);
        overLoadDemo.f("lwj");
        overLoadDemo.f("jiang");
    }
}
