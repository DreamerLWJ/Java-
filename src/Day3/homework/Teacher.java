package Day3.homework;

public class Teacher extends Person{

    private String subject;

    public Teacher(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("½²ÊÚ¿ÆÄ¿£º" + subject);
    }
}
