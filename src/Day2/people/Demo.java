package Day2.people;

import javax.print.Doc;

/**
 * @Description: TODO(���������)
 * @Author 11740
 * @Date 2021/1/26 2:27
 */
public class Demo {
    public static People[] people = new People[2];

    public static void main(String[] args) {
        // ���ֶ�̬���������Ҳ��Ϊ����ת��
        People people1 = new Doctor("Mike");
        People people2 = new Teacher("John");
        People people3 = new People("Lily");
        if (people1 instanceof People) {
            System.out.println("�ö���ΪPeople��ʵ��");
        }
        if (people1 instanceof Doctor) {
            System.out.println("�ö���ΪDoctor��ʵ��");
        }

        // ����ת��
        Teacher teacher = (Teacher) people2;
        people1.say();
        people2.say();
    }
}
