package Day5.homework;

import java.util.concurrent.SynchronousQueue;

public class Square extends Rect {
    public Square(double a) {
        super(a, a);
        this.a = a;
    }

    private double a;

    @Override
    public String toString() {
        return "正方形\n面积为" + area() + "\n周长为" + perimeter();
    }

    @Override
    public Size compare(Object obj) {
        if (obj == null || obj.getClass() != Square.class) {
            return null;
        }
        Square obj1 = (Square) obj;
        if (this.a > obj1.a) {
            return Size.GREATER;
        } else if (this.a == obj1.a) {
            return Size.EQUAL;
        } else {
            return Size.LESS;
        }
    }

    public static void main(String[] args) {
        Square square1 = new Square(5);
        System.out.println(square1);
        Rect rect1 = new Rect(5, 10);
        System.out.println(rect1);
        Circle circle1 = new Circle(5);
        System.out.println(circle1);

        Square square2 = new Square(10);
        Rect rect2 = new Rect(5, 10);
        Circle circle2 = new Circle(3);
        System.out.println(square1.compare(square2));
        System.out.println(rect1.compare((rect2)));
        System.out.println(circle1.compare((circle2)));
        System.out.println(circle1.compare((null)));
    }
}
