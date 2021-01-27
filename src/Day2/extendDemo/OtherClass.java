package Day2.extendDemo;

/**
 * @Description: TODO(请添加描述)
 * @Author 11740
 * @Date 2021/1/26 11:23
 */
public class OtherClass {
    public OtherClass() {
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        // 子类同时拥有父类的 say() 和扩展 say2()
        if (subClass instanceof SubClass) {
            System.out.println("真的");
        } else {
            System.out.println("假的");
        }
    }
}
