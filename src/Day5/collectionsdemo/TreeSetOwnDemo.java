package Day5.collectionsdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetOwnDemo {
    public static void main(String[] args) {
        // �����õ�������˵�������ڲ��࣬ʵ����һ�� Comparator �ӿ�
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        TreeSet<Person> personTreeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                // �Զ������
                return o2.age - o1.age;
            }
        });

        Person person1 = new Person(20);
        Person person2 = new Person(40);
        Person person3 = new Person(5);
        Person person4 = new Person(-10);

        // ���뵽������
        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);
        personTreeSet.add(person4);

        // TODO ������ô�������������Ķ�����
        // ��д�ⲿ���ö���� toString() ����
        System.out.println(personTreeSet);
    }
}
