package Day2.people;


public class Doctor extends People{

    public Doctor(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("�ҽ�" + name + "����һ��ҽ��");
    }
}
