package Day4.interfacedemo;


public class MyInterfaceIm implements MyInterface, MyInterface2{
    // 必须实现其所有成员方法
    @Override
    public void out() {
        System.out.println("out方法的实现");
    }

    @Override
    public void getDate() {
        System.out.println("getDate()方法的实现");
    }

    @Override
    public void say() {
        System.out.println("MyInterface2接口规范实现。");
    }
}
