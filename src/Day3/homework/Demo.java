package Day3.homework;

public class Demo {
    public static void main(String[] args) {
        /*
            ������и��������ʾ,
            �������Ϣ���Կ������̳еĴ��븴��
         */
        Person person = new Person(18, "John");
        person.displayInfo();

        System.out.println();

        Student student = new Student(18, "Lily", 1001);
        student.displayInfo();

        System.out.println();

        Teacher teacher = new Teacher(30, "Mary", "Math");
        teacher.displayInfo();

        System.out.println();

        HeadTeacher headTeacher = new HeadTeacher(35, "Mike", "Chinese", "class 001");
        headTeacher.displayInfo();

        System.out.println();

        // ѧУ�����ʾ
        School school = new School("�����ѧ");
        school.admissions(student);
        // ��Ƹ��ʦ���������˶�̬
        school.recruitment(teacher);
        school.recruitment(headTeacher);
        school.displayInfo();
    }
}
