package Day2.animal;


public class Dog extends Animal{

    public Dog(String name, String color, float weight) {
        super(name, color, weight);
    }

    public void say() {
        System.out.println(name + "������");
    }

    public static Dog compare(Dog dog1, Dog dog2) {
        return dog1.weight > dog2.weight ? dog1 : dog2;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("dog1", "��ɫ", 5.0f);
        Dog dog2 = new Dog("dog2", "��ɫ", 2.0f);

        Dog dog = Dog.compare(dog1, dog2);
        if (dog == dog2) {
            System.out.println("����������ͬһ����");
        }
        dog.say();
    }
}
