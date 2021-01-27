package Day2.permissionDemo;


public class Person {
    // �Ƿ���ȷ��ʼ���ı�־
    private boolean isInit = false;
    /*
        ����ĳ�Ա��������ʹ���� private ���η�
     */
    // ����
    String name;
    // �绰����
    private String teleNum;
    // ����
    private int age;

    public Person(String name, String teleNum, int age) {
        if (!check(age, teleNum)) {
            return;
        }

        // ��ȷ��ʼ��
        this.name = name;
        this.teleNum = teleNum;
        this.age = age;
        isInit = true;
    }

    public Person(String name) {
        this.name = name;
    }

    private boolean check(int age, String teleNum) {
        if (age <= 0 || age >= 100) {
            // �ٶ��˵������� 0 ~ 100
            // �������Ĳ������ԵĻ�
            System.err.println("����������ǷǷ��ģ�");
            return false;
        }

        if (teleNum.length() != 11) {
            // �ٶ��绰����Ϸ�����Ϊ 11
            System.err.println("����ĵ绰�����ǷǷ��ģ�");
            return false;
        }

        // ��ȷ�����
        return true;
    }

    // Getter and Setter

    public String getName() {
        return name;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public int getAge() {
        return age;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
