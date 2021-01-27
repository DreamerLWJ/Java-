package Day3.finalDemo;

public class FinalDemo {
    // 静态成员变量（类变量）
    private static final int num = 0;
    // 非静态成员变量
    private final int count;

    public FinalDemo(int count) {
        // 可以在构造方法内部对其进行初始化
        this.count = count;
        // 添加修改
    }

    public void update(int count) {
        // 尝试修改将会引发问题
//        this.count = count;

        final int i;
        i = 1;
        // 尝试修改将会引发问题
//        i = 2;
    }
}
