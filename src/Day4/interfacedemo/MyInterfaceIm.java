package Day4.interfacedemo;


public class MyInterfaceIm implements MyInterface, MyInterface2{
    // ����ʵ�������г�Ա����
    @Override
    public void out() {
        System.out.println("out������ʵ��");
    }

    @Override
    public void getDate() {
        System.out.println("getDate()������ʵ��");
    }

    @Override
    public void say() {
        System.out.println("MyInterface2�ӿڹ淶ʵ�֡�");
    }
}
