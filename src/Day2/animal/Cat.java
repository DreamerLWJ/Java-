package Day2.animal;


public class Cat extends Animal{
    public Cat(String name, String color, float weight) {
        super(name, color, weight);
    }

    @Override
    // ��д���෽��
    // ���Ǹ���ķ���
    public void say() {
        System.out.println(name + "����è��");
    }
}

class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal("����", "��ɫ", 5.0f);
        Cat cat = new Cat("����", "��ɫ", 6.0f);
        Dog dog = new Dog("����", "��ɫ", 7.0f);
        animal.say();
        cat.say();
        dog.say();
    }
}
