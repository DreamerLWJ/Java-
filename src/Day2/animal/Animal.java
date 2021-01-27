package Day2.animal;



public class Animal {
    String name;
    String color;
    float weight;

    public Animal(String name, String color, float weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }


    public void say() {
        System.out.println("我究竟是神魔动物呢？");
    }
}
