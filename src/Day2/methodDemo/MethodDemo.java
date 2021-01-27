package Day2.methodDemo;

public class MethodDemo {
    // 构造方法
    public MethodDemo() {
        System.out.println("this is a constructor");
    }

    // 成员方法
    void memberMethod() {
        System.out.println("this is a member method");
        // 这一行不会引发错误，实例成员可以访问静态成员
        staticMethod();
    }

    // 静态方法
    static void staticMethod() {
        System.out.println("this is a static method");
        // 这一行将引发编译错误！静态成员不能访问实例成员
//        memberMethod();
    }
}

class Demo {
    public static void main(String[] args) {

    }
}
