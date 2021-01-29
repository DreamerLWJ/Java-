package Day4.interfacedemo;

public interface MyInterface {
    // 接口会自动将成员变量视为static且final常量
    int FINAL_VAR = 0;
    // 下面这行与上面作用相同
//    static final int FINAL_VAR = 2;

    // 接口内实例方法的定义
    void out();

    void getDate();


    // 类方法可以有方法体,不过很少这样写
    static void dis() {
        System.out.println("I am interface!");
    }
}
