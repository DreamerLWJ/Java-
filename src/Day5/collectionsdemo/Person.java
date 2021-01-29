package Day5.collectionsdemo;


public class Person {
    int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return Integer.toString(age);
    }
}
