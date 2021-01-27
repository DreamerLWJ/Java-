package Day2.classDemo;

// ��Ķ���
public class Student {
    // ��Ա����
    String name;
    int age;
    int num;
    int[] score;

    // ��̬��Ա����
    static int studentCount = 0;

    // ��̬��Ա����
    static Student getInstance(String name, int age, int num, int[] score) {
        return new Student(name, age, num, score);
    }

    // ���췽��
    Student(String name, int age, int num, int[] score) {
        this.name = name;
        this.age = age;
        this.num = num;
        this.score = score;
        // ÿ����һ�� Student ���󣬾ͼ�¼һ������
        studentCount++;
    }

    // ��Ա����
    double average() {
        int sum = sum();
        return (double) sum / score.length;
    }

    int sum() {
        // �ֲ�����
        int sum = 0;
        for (int temp : score) {
            sum += temp;
        }
        return sum;
    }
}
