package Day2.permissionDemo;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("lwj");
        // 这个访问是成功的，因为 Demo 类与 Person 类处于同一个包下
        System.out.println(person.getName());
        String name = person.name;
    }
}
