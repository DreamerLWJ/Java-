package Day2.extendDemo;

/**
 * @Description: TODO(���������)
 * @Author 11740
 * @Date 2021/1/26 11:23
 */
public class OtherClass {
    public OtherClass() {
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        // ����ͬʱӵ�и���� say() ����չ say2()
        if (subClass instanceof SubClass) {
            System.out.println("���");
        } else {
            System.out.println("�ٵ�");
        }
    }
}
