package Day2.people;

public class People {
    public String name;

    public People(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("我叫" + name + "，是一个普通人。");
    }
}
