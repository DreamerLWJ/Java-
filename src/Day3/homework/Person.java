package Day3.homework;

public class Person {
    private int age;
    protected String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * ���������Ϣ
     */
    public void displayInfo() {
        System.out.println("������" + name);
        System.out.println("���䣺" + age);
    }
}
