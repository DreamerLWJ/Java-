package Day2.classDemo;

// 类的定义
public class Student {
    // 成员变量
    String name;
    int age;
    int num;
    int[] score;

    // 静态成员变量
    static int studentCount = 0;

    // 静态成员方法
    static Student getInstance(String name, int age, int num, int[] score) {
        return new Student(name, age, num, score);
    }

    // 构造方法
    Student(String name, int age, int num, int[] score) {
        this.name = name;
        this.age = age;
        this.num = num;
        this.score = score;
        // 每产生一个 Student 对象，就记录一次数据
        studentCount++;
    }

    // 成员方法
    double average() {
        int sum = sum();
        return (double) sum / score.length;
    }

    int sum() {
        // 局部变量
        int sum = 0;
        for (int temp : score) {
            sum += temp;
        }
        return sum;
    }
}
