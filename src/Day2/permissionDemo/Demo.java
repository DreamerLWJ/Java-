package Day2.permissionDemo;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("lwj");
        // ��������ǳɹ��ģ���Ϊ Demo ���� Person �ദ��ͬһ������
        System.out.println(person.getName());
        String name = person.name;
    }
}
