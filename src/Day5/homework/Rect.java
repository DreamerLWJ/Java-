package Day5.homework;

public class Rect implements Shape {

    private double a;
    private double b;
    private double areaSize;
    private double perimeterSize;


    public Rect(double a, double b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        this.a = a;
        this.b = b;
        areaSize = a * b;
        perimeterSize = 2.0 * a + 2.0 * b;
    }

    @Override
    public double area() {
        return areaSize;
    }

    @Override
    public double perimeter() {
        return perimeterSize;
    }

    @Override
    public String toString() {
        return "矩形\n面积为" + areaSize + "\n周长为" + perimeterSize;
    }

    @Override
    public Size compare(Object obj) {
        if (obj == null || obj.getClass() != Rect.class) {
            return null;
        }

        Rect obj1 = (Rect) obj;
        if (areaSize > obj1.areaSize) {
            return Size.GREATER;
        } else if (areaSize == obj1.areaSize) {
            return Size.EQUAL;
        } else {
            return Size.LESS;
        }
    }

    public static void main(String[] args) {
        Rect rect = new Rect(2.0, 4.0);
        Rect rect1 = new Rect(2.0, 4.0);
        System.out.println(rect.compare(rect1));
    }
}
