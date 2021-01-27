package Day3.equalDemo;

import Day3.guessGame.RandomUtil;

public class MyObject {
    private int value;

    public MyObject(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj != null && obj.getClass() == MyObject.class) {
            MyObject tar = (MyObject) obj;
            if (this.value == tar.value) {
                return true;
            }
        }

        return false;
    }
}

class Demo {
    public static void main(String[] args) {
        MyObject object1 = new MyObject(1);
        MyObject object2 = new MyObject(2);
        System.out.println(object1.hashCode() + " " + object2.hashCode());
        String s = "Hello World";
        System.out.println(object2.equals(object1));

//        boolean result = object1.equals(object2);
//        System.out.println(result);
    }
}
