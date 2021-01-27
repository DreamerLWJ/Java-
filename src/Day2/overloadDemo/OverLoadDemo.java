package Day2.overloadDemo;


public class OverLoadDemo {
    private String name;
    private int id;

    // 构造方法重载
    public OverLoadDemo(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("构造方法1");
    }

    public OverLoadDemo(String name) {
        this.name = name;
        System.out.println("构造方法2");
    }

    public OverLoadDemo(int id) {
        this.id = id;
        System.out.println("构造方法3");
    }

    public OverLoadDemo(double id) {
        System.out.println("构造方法4");
    }

    // 成员方法重载
    public int f(String name, int id) {
        System.out.println("成员方法1");
        return id;
    }

    public String f(String name) {
        System.out.println("成员方法2");
        return name;
    }

    public int f(int name) {
        System.out.println("成员方法3");
        return 1;
    }

    public static void main(String[] args) {
        OverLoadDemo overLoadDemo = new OverLoadDemo("jiang", 1);
        overLoadDemo.f("lwj");
        overLoadDemo.f("jiang");
    }
}
