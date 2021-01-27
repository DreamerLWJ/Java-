package Day2.classDemo;

import Day2.permissionDemo.Person;

public class PackageDemo {
    public static void main(String[] args) {
        Person person = new Person("lwj");
        // 以下访问是成功的，因为 getName() 是 public 的
        String name = person.getName();
        // 以下访问是失败的，因为 check() 是 private 的
//        person.check();
        // 以下访问是出现错误的
//        boolean b = person.isInit;
    }
}
