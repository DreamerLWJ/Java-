package Day2.classDemo;


public class StudentDemo {
    public static void main(String[] args) {
        // �������
        Student xiaoMing = new Student("С��", 18, 1001,
                new int[]{60, 70, 80, 90}
        );

        Student xiaoHua = new Student("С��", 18, 1002,
                new int[]{90, 95, 92, 97, 78}
        );

        System.out.println("С�����ֺܷ�ƽ����Ϊ��" + xiaoMing.sum() + " " + xiaoMing.average());
        System.out.println("С�����ֺܷ�ƽ����Ϊ��" + xiaoHua.sum() + " " + xiaoHua.average());
    }
}
