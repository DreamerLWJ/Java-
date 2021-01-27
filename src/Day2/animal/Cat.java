package Day2.animal;


public class Cat extends Animal{
    public Cat(String name, String color, float weight) {
        super(name, color, weight);
    }

    @Override
    // 重写父类方法
    // 覆盖父类的方法
    public void say() {
        System.out.println(name + "我是猫咪");
    }
}

class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal("动物", "绿色", 5.0f);
        Cat cat = new Cat("动物", "黄色", 6.0f);
        Dog dog = new Dog("动物", "蓝色", 7.0f);
        animal.say();
        cat.say();
        dog.say();
    }
}
