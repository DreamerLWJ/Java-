package Day2.extendDemo;

public class SubClass extends SuperClass{

    public SubClass() {
        System.out.println("子类的构造方法执行中...");
    }

    // 扩展父类的功能
    public void say2() {
        // 子类拥有父类的成员变量
        String s = this.name;
        System.out.println("SubClass " + " My father is " + name);
    }
}

