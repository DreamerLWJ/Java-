package Day3.finalDemo.finalMethod;

public class SubClass extends SuperClass{

    // 下面将会引发问题
//    public final void say() {
//        System.out.println("子类不能重写父类的final方法");
//    }

    @Override
    public void say2() {
        System.out.println("子类重写了父类的非final方法");
    }
}
