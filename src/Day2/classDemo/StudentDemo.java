package Day2.classDemo;


public class StudentDemo {
    public static void main(String[] args) {
        // 传入参数
        Student xiaoMing = new Student("小明", 18, 1001,
                new int[]{60, 70, 80, 90}
        );

        Student xiaoHua = new Student("小花", 18, 1002,
                new int[]{90, 95, 92, 97, 78}
        );

        System.out.println("小明的总分和平均分为：" + xiaoMing.sum() + " " + xiaoMing.average());
        System.out.println("小花的总分和平均分为：" + xiaoHua.sum() + " " + xiaoHua.average());
    }
}
