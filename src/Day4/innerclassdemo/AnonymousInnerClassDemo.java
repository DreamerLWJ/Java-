package Day4.innerclassdemo;

interface Product {
    double getPrice();

    double getWeight();
}

public class AnonymousInnerClassDemo {
    void test(Product product) {
        System.out.println("��Ʒ������Ϊ��" + product.getWeight());
        System.out.println("��Ʒ�ļ۸�Ϊ��" + product.getPrice());
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
        // �����ڲ��࣬�ʺ���ֻʹ��һ�ε��ڲ���
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
