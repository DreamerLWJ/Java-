package Day2.permissionDemo;


public class Person {
    // 是否正确初始化的标志
    private boolean isInit = false;
    /*
        这里的成员变量，都使用了 private 修饰符
     */
    // 姓名
    String name;
    // 电话号码
    private String teleNum;
    // 年龄
    private int age;

    public Person(String name, String teleNum, int age) {
        if (!check(age, teleNum)) {
            return;
        }

        // 正确初始化
        this.name = name;
        this.teleNum = teleNum;
        this.age = age;
        isInit = true;
    }

    public Person(String name) {
        this.name = name;
    }

    private boolean check(int age, String teleNum) {
        if (age <= 0 || age >= 100) {
            // 假定人的年龄是 0 ~ 100
            // 如果传入的参数不对的话
            System.err.println("输入的年龄是非法的！");
            return false;
        }

        if (teleNum.length() != 11) {
            // 假定电话号码合法长度为 11
            System.err.println("输入的电话号码是非法的！");
            return false;
        }

        // 正确的情况
        return true;
    }

    // Getter and Setter

    public String getName() {
        return name;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public int getAge() {
        return age;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
