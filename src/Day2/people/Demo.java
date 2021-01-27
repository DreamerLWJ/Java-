package Day2.people;

import javax.print.Doc;

/**
 * @Description: TODO(请添加描述)
 * @Author 11740
 * @Date 2021/1/26 2:27
 */
public class Demo {
    public static People[] people = new People[2];

    public static void main(String[] args) {
        // 这种多态的情况我们也称为向下转型
        People people1 = new Doctor("Mike");
        People people2 = new Teacher("John");
        People people3 = new People("Lily");
        if (people1 instanceof People) {
            System.out.println("该对象为People的实例");
        }
        if (people1 instanceof Doctor) {
            System.out.println("该对象为Doctor的实例");
        }

        // 向上转型
        Teacher teacher = (Teacher) people2;
        people1.say();
        people2.say();
    }
}
