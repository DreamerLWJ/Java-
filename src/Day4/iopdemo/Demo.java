package Day4.iopdemo;

public class Demo {
    public static void main(String[] args) {
        Person person1 = new Person(18);
        Person person2 = new Person(20);

        Circle circle1 = new Circle(8.0);
        Circle circle2 = new Circle(4.0);

        System.out.print("person1�Ƿ����person2?:");
        com(person1, person2);

        System.out.println();

        System.out.print("circle1�Ƿ����circle2?:");
        com(circle1, circle2);
    }

    // ��� com �����������ǽӿ�, ������ Person ���� Circle ��
    // �������ĺô������ṩһ���淶, ����ʵ���� Comparable �ӿڵ���
    // ����󶼿�����Ϊ��������
    // �����������������ת��
    static void com(Comparable c1, Comparable c2) {
        System.out.println(c1.compare(c2));
    }
}
