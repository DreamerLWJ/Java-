package Day3.homework;

public class Student extends Person{
    /**
     * Ñ§ºÅ
     */
    private int studentID;

    public Student(int age, String name, int studentID) {
        super(age, name);
        this.studentID = studentID;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ñ§ºÅ£º" + studentID);
    }

    public String toString() {
        return "1";
    }

    public static void main(String[] args) {
        Student student = new Student(20, "lwj", 1001);
        System.out.println(student);
    }
}
