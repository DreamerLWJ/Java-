package Day5.collectionsdemo;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListDemo {
    public static void main(String[] args) {
        // ʹ���������ʵ�ֿ��ٸ�ֵ
        Random random = new Random();

        // ���� List ��
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();

        // ��ֵ
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(random.nextInt(50) - 10);
        }

        for (int i = 0; i < 10; i++) {
            integerLinkedList.add(random.nextInt(50) - 10);
        }

        // �������
        System.out.println("����������������£�");
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
