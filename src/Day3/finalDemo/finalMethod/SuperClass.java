package Day3.finalDemo.finalMethod;

public class SuperClass {
    // 该方法将不能被重写
    public final void say() {
        System.out.println("父类的final方法");
    }

    public void say2() {
        System.out.println("父类的非final方法");
    }
}
