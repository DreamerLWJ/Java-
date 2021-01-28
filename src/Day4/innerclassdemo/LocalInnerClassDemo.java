package Day4.innerclassdemo;

public class LocalInnerClassDemo {
    void test() {
        class LocalInnerClass {
            void info() {
                System.out.println("我是局部内部类！");
            }
        }

        // 下面代码是正常运行的
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.info();
    }
}

class Demo2 {
    public static void main(String[] args) {
        // 下面代码将出现错误，局部内部类只在定义方法内有效
//        LocalInnerClass innerClass = new LocalInnerClass();

        LocalInnerClassDemo demo = new LocalInnerClassDemo();
    }
}
