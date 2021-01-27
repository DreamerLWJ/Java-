package Day3.homework;

public class Demo {
    public static void main(String[] args) {
        /*
            下面进行各种类的演示,
            从输出信息可以看出，继承的代码复用
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

        // 学校类的演示
        School school = new School("地球大学");
        school.admissions(student);
        // 招聘老师方法体现了多态
        school.recruitment(teacher);
        school.recruitment(headTeacher);
        school.displayInfo();
    }
}
