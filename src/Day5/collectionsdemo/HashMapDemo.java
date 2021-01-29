package Day5.collectionsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo {
    public static void main(String[] args) {
        // <key类型，value类型> 告诉 HashMap 你要装入什么类型的东西
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("lwj", 1001);
        hashMap.put("jia", 1002);
        hashMap.put("hahah", 1003);
        hashMap.put("zhuo", 1004);

        // (1) 遍历方法1：forEach()
        System.out.println("\nforEach()遍历如下");
        hashMap.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println("key:" + s + " " + "value:" + integer);
            }
        });

        // 添加重复的 key 将会被覆盖
        hashMap.put("lwj", 999);

        // (2) 遍历方法2：entrySet()
        // 获取 Map 内部类 Entry（保存key-value）的 Set 集合
        // 下面Set里面保存的是“Map.Entry<String, Integer>”类型
        System.out.println("\nentrySet()遍历如下：");
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();

        // 对其使用 Set 拥有的遍历方法
        Iterator<Map.Entry<String, Integer>> entryIterator = entries.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> kV = entryIterator.next();
            System.out.println("key:" + kV.getKey() + " " + "value:" + kV.getValue());
        }

        // foreach遍历
        System.out.println("\nforeach遍历如下：");


        // HashMap操作
        System.out.println(hashMap.get("lwj"));
    }
}
