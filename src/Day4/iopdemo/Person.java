package Day4.iopdemo;

public class Person implements Comparable {
    private final int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public boolean compare(Object o) {
        // 自定义人的年龄作为比较的标准
        if (o != null && o.getClass() == this.getClass()) {
            // 非空且类型一致才进行比较
            // 然后进行向上转型(强制类型转换)
            Person p = (Person) o;

            // 以年龄作为比较标准
            return this.age >= p.age;
        }

        return false;
    }
}
