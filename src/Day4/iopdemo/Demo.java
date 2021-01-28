package Day4.iopdemo;

public class Demo {
    public static void main(String[] args) {
        Person person1 = new Person(18);
        Person person2 = new Person(20);

        Circle circle1 = new Circle(8.0);
        Circle circle2 = new Circle(4.0);

        System.out.print("person1是否大于person2?:");
        com(person1, person2);

        System.out.println();

        System.out.print("circle1是否大于circle2?:");
        com(circle1, circle2);
    }

    // 这个 com 方法依赖的是接口, 而不是 Person 或者 Circle 类
    // 这样做的好处就是提供一个规范, 凡是实现了 Comparable 接口的类
    // 其对象都可以作为参数传入
    // 这个方法利用了向下转型
    static void com(Comparable c1, Comparable c2) {
        System.out.println(c1.compare(c2));
    }
}
