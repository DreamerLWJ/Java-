package Day5.collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class HashSetDemo {
    public static void main(String[] args) {
        // �����ҿ�����ʱ������� <String> ��ʲô����ǰ���ߴ����з���
        Set<String> stringSet = new HashSet<>();
        // һ�������е����ж������ͱ���һ��
        // <����Ҫ����������>
        Set<Integer> integerSet = new HashSet<>();
        // ʹ�� Set ����ֱ�Ӷ������Ҳ�ǶԵģ������д�����ڶ�̬�е�����ת��
        HashSet<Character> characterHashSet = new HashSet<>();

//        traverseTest();
        operationTest();
    }

    /**
     * ���ַ���Ԫ��Ϊ������ʾ����
     */
    static void traverseTest() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("��һ������");
        stringSet.add("�ڶ�������");
        stringSet.add("����������");

        // ��������(1)��ʹ�� foreach ���
        System.out.println("ʹ�� foreach ������������£�");
        for (String s : stringSet) {
            System.out.println(s);
        }

        // TODO ˼����Ϊʲô��ͨ�� fori ��������

        // ��������(2)��ʹ�� Iterator ���
        System.out.println("ʹ�� Iterator ����������£�");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        // ��������(3)��ʹ�� forEach() ����
        System.out.println("ʹ�� forEach()��������������£�");
        stringSet.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    /**
     * ������Ԫ��Ϊ����ʾ HashSet �Ļ�������
     */
    static void operationTest() {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            set1.add(i);
        }

        for (int i = 6; i <= 15; i++) {
            set2.add(i);
        }

        System.out.println("set1��" + set1);
        System.out.println("set2��" + set2);

        boolean b = set1.contains(1);
        System.out.println("set1�Ƿ����1��" + b);
        System.out.println("set1�Ĵ�СΪ��" + set1.size());
        System.out.println("set2�Ĵ�СΪ��" + set2.size());
        // ��������
//        set1.retainAll(set2);
//        System.out.println("set1��set2�Ľ���Ϊ��" + set1);

//        System.out.println("set1�Ƿ����set2��" + set1.containsAll(set2)); // �жϰ�����ϵ
        // ���в����
        set1.removeAll(set2);
        System.out.println("set1��set2�ĲΪ��" + set1);
    }
}
