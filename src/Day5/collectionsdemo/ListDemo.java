package Day5.collectionsdemo;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListDemo {
    public static void main(String[] args) {
        // 使用随机数来实现快速赋值
        Random random = new Random();

        // 两个 List 类
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        // 赋值
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(random.nextInt(50) - 10);
        }

        for (int i = 0; i < 10; i++) {
            integerLinkedList.add(random.nextInt(50) - 10);
        }

        // 输出两表
        System.out.println("两个表的输出结果如下：");
        System.out.println(integerArrayList);
        System.out.println(integerLinkedList);


        integerArrayList.add(7, 60);
        integerArrayList.remove(3);
        System.out.println(integerArrayList);


        integerLinkedList.add(7, 60);
        integerLinkedList.remove(3);
        System.out.println(integerLinkedList);
    }
}
