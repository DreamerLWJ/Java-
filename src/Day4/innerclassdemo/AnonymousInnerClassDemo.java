package Day4.innerclassdemo;

interface Product {
    double getPrice();

    double getWeight();
}

public class AnonymousInnerClassDemo {
    void test(Product product) {
        System.out.println("产品的质量为：" + product.getWeight());
        System.out.println("产品的价格为：" + product.getPrice());
    }
}


class Milk implements Product {

    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public double getWeight() {
        return 10;
    }
}

class Demo3 {
    public static void main(String[] args) {
        AnonymousInnerClassDemo anonymousInnerClassDemo = new AnonymousInnerClassDemo();
        // 匿名内部类，适合于只使用一次的内部类
        Milk milk = new Milk();

        anonymousInnerClassDemo.test(new Product() {
            @Override
            public double getPrice() {
                return 2.0;
            }

            @Override
            public double getWeight() {
                return 5;
            }
        });

        anonymousInnerClassDemo.test(milk);
    }
}
