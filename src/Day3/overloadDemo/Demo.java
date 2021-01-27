package Day3.overloadDemo;

public class Demo {

    public void out() {
        System.out.println("重载方法6");
    }

    public void out(int i) {
        System.out.println("重载方法2");
    }

    public void out(double d) {
        System.out.println("重载方法3");
    }
//
//    public void out(String s, int i) {
//        System.out.println("重载方法4");
//    }
//
//    public void out(String s, double) {
//        System.out.println("重载方法5");
//    }
}
