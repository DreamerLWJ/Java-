package Day4.innerclassdemo;

public class Cow {
    private double weight;

    public Cow(double weight) {
        this.weight = weight;
    }

    public void test() {
        CowLeg cowLeg = new CowLeg(2);
        // 外部类想要访问内部类成员，需要创建内部类对象
        cowLeg.info();

        // 下面代码将会出现问题，因为外部类不能直接访问非静态内部类成员
        // 可以理解为，内部类的属性对外部类来说是不可预知的
        // 外部类在创建非静态内部类对象之前不知道，内部类对象属性将会是如何
//        System.out.println(length);
    }

    private class CowLeg {
        private double length;

        public CowLeg(double length) {
            this.length = length;
        }

        public void info() {
            System.out.println("我是一条长为" + length + "的牛腿。");
            System.out.println("我所在的牛的重量为：" + weight);
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Cow cow = new Cow(250.0);
        cow.test();
    }
}
