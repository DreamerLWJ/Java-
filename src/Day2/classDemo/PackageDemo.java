package Day2.classDemo;

import Day2.permissionDemo.Person;

public class PackageDemo {
    public static void main(String[] args) {
        Person person = new Person("lwj");
        // ���·����ǳɹ��ģ���Ϊ getName() �� public ��
        String name = person.getName();
        // ���·�����ʧ�ܵģ���Ϊ check() �� private ��
//        person.check();
        // ���·����ǳ��ִ����
//        boolean b = person.isInit;
    }
}
