package Day3.homework;

public class Person {
    private int age;
    protected String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 输出个人信息
     */
    public void displayInfo() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
    }
}
