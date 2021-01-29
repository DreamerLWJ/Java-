package Day5.collectionsdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();

        integerTreeSet.add(9);
        integerTreeSet.add(5);
        integerTreeSet.add(-2);
        integerTreeSet.add(8);
        integerTreeSet.add(7);
        integerTreeSet.add(11);

        System.out.println("TreeSet����Ϊ��" + integerTreeSet);
        System.out.println("TreeSet��һ��Ԫ���ǣ�" +integerTreeSet.first());
        System.out.println("TreeSet���һ��Ԫ���ǣ�" + integerTreeSet.last());
        // ���� fromElement
        System.out.println("TreeSet��5��ʼ�������Ӽ�Ϊ��" + integerTreeSet.tailSet(5));
        // ������ toElement
        System.out.println("TreeSet�ӵ�һ��Ԫ�ؿ�ʼ��8���Ӽ�Ϊ��" + integerTreeSet.headSet(8));

        // ���������ʱ���
        Iterator<Integer> iterator = integerTreeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
