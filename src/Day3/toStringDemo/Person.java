package Day3.toStringDemo;

public class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("��Һã��ҽ�" + name);
    }
}

// ϸ�ڣ�Ϊʲô��д public��
class Demo {
    public static void main(String[] args) {
        Person person = new Person("���Ŀ�");
        // �������ʲô��Ϊʲô��
        System.out.println(person);
    }
}