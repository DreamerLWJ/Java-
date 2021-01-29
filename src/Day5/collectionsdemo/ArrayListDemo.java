package Day5.collectionsdemo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(0, 3);
        arrayList.add(1);
        arrayList.add(5);

        // ArrayList 遍历
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        // foreach 遍历
//        for (int i : arrayList) {
//            System.out.println(i);
//        }

        // 迭代器遍历
//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // forEach()方法
//        arrayList.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
    }
}
