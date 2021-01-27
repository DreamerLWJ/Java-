package Day3.homework;

public class HeadTeacher extends Teacher{
    /**
     * 负责班级
     */
    private String clazz;

    public HeadTeacher(int age, String name, String subject, String clazz) {
        super(age, name, subject);
        this.clazz = clazz;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("负责班级：" + clazz);
    }
}
