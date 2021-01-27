package Day3.homework;

public class School {
    /**
     * 学校名字
     */
    private String schoolName;
    /**
     * 学生人数
     */
    private int studentCount = 0;

    /**
     * 教职工人数
     */
    private int workerCount = 0;

    /**
     * 最大人数
     */
    private final int MAX_COUNT = 30;
    /**
     * 保存学生
     */
    private Student[] students = new Student[MAX_COUNT];

    /**
     * 保存教师，体现多态
     */
    private Teacher[] teachers = new Teacher[MAX_COUNT];


    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * 招生方法
     * @param student 招入的学生
     */
    public void admissions(Student student) {
        students[studentCount] = student;
        studentCount++;
    }

    /**
     * 招聘方法
     * @param teacher 招入的老师
     */
    public void recruitment(Teacher teacher) {
        teachers[workerCount] = teacher;
        workerCount++;
    }

    public void displayInfo() {
        System.out.println("学校：" + schoolName);
        System.out.println("学生人数为：" + studentCount);
        System.out.println("教师人数为：" + workerCount);
    }
}
