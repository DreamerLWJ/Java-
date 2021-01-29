package Day5.collectionsdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapDemo {
    public static void main(String[] args) {
        // <key���ͣ�value����> ���� HashMap ��Ҫװ��ʲô���͵Ķ���
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("lwj", 1001);
        hashMap.put("jia", 1002);
        hashMap.put("hahah", 1003);
        hashMap.put("zhuo", 1004);

        // (1) ��������1��forEach()
        System.out.println("\nforEach()��������");
        hashMap.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println("key:" + s + " " + "value:" + integer);
            }
        });

        // ����ظ��� key ���ᱻ����
        hashMap.put("lwj", 999);

        // (2) ��������2��entrySet()
        // ��ȡ Map �ڲ��� Entry������key-value���� Set ����
        // ����Set���汣����ǡ�Map.Entry<String, Integer>������
        System.out.println("\nentrySet()�������£�");
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();

        // ����ʹ�� Set ӵ�еı�������
        Iterator<Map.Entry<String, Integer>> entryIterator = entries.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> kV = entryIterator.next();
            System.out.println("key:" + kV.getKey() + " " + "value:" + kV.getValue());
        }

        // foreach����
        System.out.println("\nforeach�������£�");


        // HashMap����
        System.out.println(hashMap.get("lwj"));
    }
}
