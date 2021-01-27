package Day2.people;


public class Doctor extends People{

    public Doctor(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("我叫" + name + "，是一名医生");
    }
}
