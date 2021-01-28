package Day4.iopdemo;

public class Person implements Comparable {
    private final int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public boolean compare(Object o) {
        // �Զ����˵�������Ϊ�Ƚϵı�׼
        if (o != null && o.getClass() == this.getClass()) {
            // �ǿ�������һ�²Ž��бȽ�
            // Ȼ���������ת��(ǿ������ת��)
            Person p = (Person) o;

            // ��������Ϊ�Ƚϱ�׼
            return this.age >= p.age;
        }

        return false;
    }
}
