package Day5.collectionsdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class HashSetDemo {
    public static void main(String[] args) {
        // 这里大家可能暂时不能理解 <String> 是什么，提前告诉大家这叫泛型
        Set<String> stringSet = new HashSet<>();
        // 一个集合中的所有对象类型必须一致
        // <你想要的引用类型>
        Set<Integer> integerSet = new HashSet<>();
        // 使用 Set 子类直接定义对象也是对的，上面的写法属于多态中的向下转型
        HashSet<Character> characterHashSet = new HashSet<>();

//        traverseTest();
        operationTest();
    }

    /**
     * 以字符串元素为例，演示遍历
     */
    static void traverseTest() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("第一个加入");
        stringSet.add("第二个加入");
        stringSet.add("第三个加入");

        // 遍历方法(1)：使用 foreach 语句
        System.out.println("使用 foreach 语句遍历结果如下：");
        for (String s : stringSet) {
            System.out.println(s);
        }

        // TODO 思考：为什么不通过 fori 语句遍历？

        // 遍历方法(2)：使用 Iterator 语句
        System.out.println("使用 Iterator 遍历结果如下：");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

        // 遍历方法(3)：使用 forEach() 方法
        System.out.println("使用 forEach()方法遍历结果如下：");
        stringSet.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }

    /**
     * 以整数元素为例演示 HashSet 的基本操作
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

        System.out.println("set1：" + set1);
        System.out.println("set2：" + set2);

        boolean b = set1.contains(1);
        System.out.println("set1是否包含1：" + b);
        System.out.println("set1的大小为：" + set1.size());
        System.out.println("set2的大小为：" + set2.size());
        // 交集运算
//        set1.retainAll(set2);
//        System.out.println("set1和set2的交集为：" + set1);

//        System.out.println("set1是否包含set2：" + set1.containsAll(set2)); // 判断包含关系
        // 进行差集运算
        set1.removeAll(set2);
        System.out.println("set1与set2的差集为：" + set1);
    }
}
