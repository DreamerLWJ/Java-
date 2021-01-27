package Day3.homework;

public class School {
    /**
     * ѧУ����
     */
    private String schoolName;
    /**
     * ѧ������
     */
    private int studentCount = 0;

    /**
     * ��ְ������
     */
    private int workerCount = 0;

    /**
     * �������
     */
    private final int MAX_COUNT = 30;
    /**
     * ����ѧ��
     */
    private Student[] students = new Student[MAX_COUNT];

    /**
     * �����ʦ�����ֶ�̬
     */
    private Teacher[] teachers = new Teacher[MAX_COUNT];


    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * ��������
     * @param student �����ѧ��
     */
    public void admissions(Student student) {
        students[studentCount] = student;
        studentCount++;
    }

    /**
     * ��Ƹ����
     * @param teacher �������ʦ
     */
    public void recruitment(Teacher teacher) {
        teachers[workerCount] = teacher;
        workerCount++;
    }

    public void displayInfo() {
        System.out.println("ѧУ��" + schoolName);
        System.out.println("ѧ������Ϊ��" + studentCount);
        System.out.println("��ʦ����Ϊ��" + workerCount);
    }
}
