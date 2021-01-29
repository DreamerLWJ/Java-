package Day5.collectionsdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetOwnDemo {
    public static void main(String[] args) {
        // 这里用到了我们说的匿名内部类，实现了一个 Comparator 接口
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        TreeSet<Person> personTreeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                // 自定义规则
                return o2.age - o1.age;
            }
        });

        Person person1 = new Person(20);
        Person person2 = new Person(40);
        Person person3 = new Person(5);
        Person person4 = new Person(-10);

        // 加入到集合中
        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);
        personTreeSet.add(person4);

        // TODO 这里怎么做到输出有意义的东西？
        // 重写外部引用对象的 toString() 方法
        System.out.println(personTreeSet);
    }
}
