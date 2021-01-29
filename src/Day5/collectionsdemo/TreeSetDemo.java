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

        System.out.println("TreeSet内容为：" + integerTreeSet);
        System.out.println("TreeSet第一个元素是：" +integerTreeSet.first());
        System.out.println("TreeSet最后一个元素是：" + integerTreeSet.last());
        // 包含 fromElement
        System.out.println("TreeSet从5开始到最后的子集为：" + integerTreeSet.tailSet(5));
        // 不包含 toElement
        System.out.println("TreeSet从第一个元素开始到8的子集为：" + integerTreeSet.headSet(8));

        // 迭代器访问遍历
        Iterator<Integer> iterator = integerTreeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
