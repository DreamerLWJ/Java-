package Day4.interfacedemo;

public interface MyInterface {
    // �ӿڻ��Զ�����Ա������Ϊstatic��final����
    int FINAL_VAR = 0;
    // ��������������������ͬ
//    static final int FINAL_VAR = 2;

    // �ӿ���ʵ�������Ķ���
    void out();

    void getDate();


    // �෽�������з�����,������������д
    static void dis() {
        System.out.println("I am interface!");
    }
}
